package cn.kpy.SpringJDBC.ProgramTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.ProgramTransaction
 * @data: 2019-4-3 8:44
 * @discription: 编程式事务管理
 **/
public class MainTransaction {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ProgramTransaction.xml");
        StudentDAOImpl studentDAOImpl= (StudentDAOImpl) applicationContext.getBean("studentDAOImpl");
        System.out.println("Create Table...");
        studentDAOImpl.Create("John",20,1, 1994);
        studentDAOImpl.Create("James",22,2, 1993);
        System.out.println("Query AllRecord...");
        List<StudentMarks> studentMarksList = studentDAOImpl.ListStudentMarks();
        for(StudentMarks studentMarks:studentMarksList){
            System.out.print("ID："+studentMarks.getId());
            System.out.print("Name："+studentMarks.getName());
            System.out.print("Age："+studentMarks.getMarks());
            System.out.print("Marks："+studentMarks.getMarks());
            System.out.print("Year："+studentMarks.getYear());
            System.out.println();
        }
    }
}
