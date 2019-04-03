package cn.kpy.SpringJDBC.ProgramTransaction;

import javax.sql.DataSource;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.ProgramTransaction
 * @data: 2019-4-2 21:21
 * @discription: 创建数据库操作增删改查接口
 **/
public interface StudentDAO {
    void setDataSource(DataSource dataSource);
    void Create(String name,int age,int marks,int year);
    List<StudentMarks> ListStudentMarks();
}
