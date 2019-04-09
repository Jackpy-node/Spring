package cn.kpy.SpringJDBC.DeclareTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.DeclareTransaction
 * @data: 2019-4-2 21:33
 * @discription: 数据库接口实现类
 **/
public class StudentMarksImpl implements StudentDAO{

    private final static Logger logger= LogManager.getLogger(StudentMarksImpl.class);

    //用于通过xml配置文件加载数据库驱动
    private DataSource dataSource;
    //Spring JDBC工具类
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        jdbcTemplateObject=new JdbcTemplate(dataSource);
    }
    @Override
    public void Create(String name, int age, int marks, int year) {
        try {
            String SQL = "insert into student (name, age) value (?, ?)";
            jdbcTemplateObject.update(SQL, name, age);
            // Get the latest student id to be used in Marks table
            String SQL1 = "select max(id) from student";
            int sid = jdbcTemplateObject.queryForObject(SQL1, null, int.class);
            String SQL2 = "insert into marks (sid,marks,year) value (?, ?, ?)";
            jdbcTemplateObject.update(SQL2, sid, marks, year);
            logger.debug("[%s%s%s]",sid,marks,year);
            System.out.println("Create Name：" + name + " Age：" + age);
            //To simulate the exception
            throw new RuntimeException("Simulate Error Condition !");
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            e.printStackTrace();
        }
    }

    @Override
    public List<StudentMarks> ListStudentMarks() {
        String SQL="select * from student,marks where student.id=marks.sid";
        List<StudentMarks> StudentMarks=jdbcTemplateObject.query(SQL, new StudentMarksMapper());
        return StudentMarks;
    }
}
