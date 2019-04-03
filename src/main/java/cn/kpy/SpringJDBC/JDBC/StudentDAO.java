package cn.kpy.SpringJDBC.JDBC;

import javax.sql.DataSource;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.Resource
 * @data: 2019-3-29 8:23
 * @discription: DAO接口
 **/
public interface StudentDAO {
    public void setDataSource(DataSource dataSource);

    public void insert(String name,int age);

    public Student query(int id);

    public List<Student> queryAll();

    public void delete(int id);

    public void update(int id,int name);
}
