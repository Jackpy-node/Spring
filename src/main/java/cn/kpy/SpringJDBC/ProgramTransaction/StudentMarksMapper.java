package cn.kpy.SpringJDBC.ProgramTransaction;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.ProgramTransaction
 * @data: 2019-4-2 21:25
 * @discription: 将数据库返回结果与对象实例属性进行映射,RowMapper可以将数据中的每一行数据封装成用户自定义的类
 **/
public class StudentMarksMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.setId(resultSet.getInt("id"));
        studentMarks.setName(resultSet.getString("name"));
        studentMarks.setAge(resultSet.getInt("age"));
        studentMarks.setSid(resultSet.getInt("sid"));
        studentMarks.setMarks(resultSet.getInt("marks"));
        studentMarks.setYear(resultSet.getInt("year"));
        return studentMarks;
    }
}
