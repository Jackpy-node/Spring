package cn.kpy.SpringIoC.SpringStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent
 * @data: 2019-3-18 21:04
 * @discription: 通过bean的parent属性进行继承
 **/
public class BeanExtends {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IOCBeans.xml");
        Student student = (Student) applicationContext.getBean("parentStudent");
        System.out.println("student："+student.getName()+"..."+student.getAge()+"..."+student.getSex());

        /**
         *  1、Spring允许继承bean的配置，被继承的bean称为父bean，继承这个父Bean的Bean称为子Bean
         *  2、子Bean从父Bean中继承配置，包括Bean的属性配置
         *  3、子Bean可以覆盖从父Bean继承过来的配置
         * */
        PrimaryStudent primaryStudent= (PrimaryStudent) applicationContext.getBean("primaryStudent");
        System.out.println("primaryStudent："+primaryStudent.getName()+"..."+primaryStudent.getAge()+"..."+primaryStudent.getSex());
    }
}
