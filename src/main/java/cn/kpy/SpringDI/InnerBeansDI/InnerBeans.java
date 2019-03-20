package cn.kpy.SpringDI.InnerBeansDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-19 21:10
 * @discription: 注入内部Beans,相当于java的内部类
 **/
public class InnerBeans {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("InnerBeans.xml");
        Computer computer = (Computer) applicationContext.getBean("computer");
        computer.TurnOn();

    }
}
