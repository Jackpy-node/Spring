package cn.kpy.SpringJDBC.ProgramTransaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.ProgramTransaction
 * @data: 2019-4-2 21:33
 * @discription: 数据库接口实现类
 **/
public class StudentDAOImpl implements StudentDAO{

    //用于通过xml配置文件加载数据库驱动
    private DataSource dataSource;
    //Spring JDBC工具类
    private JdbcTemplate jdbcTemplate;
    //Spring JDBC事务管理工具类
    private PlatformTransactionManager platformTransactionManager;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    @Override
    public void Create(String name, int age, int marks, int year) {
        //建立事务
        TransactionDefinition transactionDefinition=new DefaultTransactionDefinition();
        //开启事务
        TransactionStatus transactionStatus=platformTransactionManager.getTransaction(transactionDefinition);

        try {
            String SQL1 = "insert into student (name, age) value (?,?)";
            jdbcTemplate.update(SQL1, name, age);
            String SQL2 = "select max(id) from student";
            int sid = jdbcTemplate.queryForObject(SQL2, null, int.class);
            String SQL3 = "insert into marks (sid,marks,year) value (?,?,?)";
            jdbcTemplate.update(SQL3, sid, marks, year);
            System.out.println("Create Name=" + name + " Age=" + age);
            platformTransactionManager.commit(transactionStatus);
        }
        catch (DataAccessException e){
            System.out.println("Error in creating record, rolling back");
            platformTransactionManager.rollback(transactionStatus);
            e.printStackTrace();
        }

    }

    @Override
    public List<StudentMarks> ListStudentMarks() {
        String SQL="select * from student,marks where student.id=marks.sid";
        List<StudentMarks> StudentMarks=jdbcTemplate.query(SQL, new StudentMarksMapper());
        return StudentMarks;
    }
}
