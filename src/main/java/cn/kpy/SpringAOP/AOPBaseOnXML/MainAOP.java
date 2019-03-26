package cn.kpy.SpringAOP.AOPBaseOnXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAOP.AOPBaseOnXML
 * @data: 2019-3-26 21:01
 * @discription: 基于XML配置文件的方式进行面向切面编程
 **/
public class MainAOP {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("XMLBeans.xml");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println("Name："+student.getName()+"Age："+student.getAge());
        student.printThrowException();
    }
}
