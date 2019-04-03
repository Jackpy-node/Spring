package cn.kpy.SpringJDBC.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.JDBC
 * @data: 2019-4-2 8:10
 * @discription:
 **/
public class MainJDBC {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("JDBC.xml");
        StudentDAOImpl studentDAOImpl= (StudentDAOImpl) applicationContext.getBean("studentDaoImpl");
        System.out.println("Insert Records Into table_student...");
        studentDAOImpl.insert("John", 20);
        studentDAOImpl.insert("Mary", 25);
        studentDAOImpl.insert("James", 21);
        System.out.println("Query All Students From table_student...");
        List<Student> studentList=studentDAOImpl.queryAll();
        for(Student student:studentList){
            System.out.println(student.getId()+"："+student.getName()+"---"+student.getAge());
        }
        System.out.println("Query Student By id....");
        Student student=studentDAOImpl.query(1);
        System.out.println(student.getId()+"："+student.getName()+"---"+student.getAge());

    }
}
