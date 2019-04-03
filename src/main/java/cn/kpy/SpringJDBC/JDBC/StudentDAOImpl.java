package cn.kpy.SpringJDBC.JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.JDBC
 * @data: 2019-3-29 8:52
 * @discription: DAO接口实现类
 **/
public class StudentDAOImpl implements StudentDAO {

    //dataSource目的通过xml配置文件加载数据库驱动
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(String name, int age) {
        String SQL = "insert into table_student(name,age) value(?,?)";
        jdbcTemplate.update(SQL, name, age);
        System.out.println("insert into table_student(name,age) value("+name+","+age);
    }

    @Override
    public Student query(int id) {
        String SQL = "select * from table_student where id=?";
        Student student = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> queryAll() {
        String SQL = "select * from table_student";
        List<Student> studentList = jdbcTemplate.query(SQL, new StudentMapper());
        return studentList;
    }

    @Override
    public void delete(int id) {
        String SQL = "delete from table_student where id=?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Delete Record With Id=" + "id");
    }

    @Override
    public void update(int id, int name) {
        String SQL = "update table_student set name=? where id=?";
        jdbcTemplate.update(SQL, name, id);
    }
}
