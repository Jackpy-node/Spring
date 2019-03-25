package cn.kpy.JavaAnnotation.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation
 * @data: 2019-3-23 12:49
 * @discription: 基于java的配置，无需Bean.xml配置文件
 **/
public class MainHello {
    public static void main(String[] args) {
        /**
         * 等价写法：
         *  ApplicationContext applicationContext1=new AnnotationConfigApplicationContext();
         *  ((AnnotationConfigApplicationContext) applicationContext1).register(HelloConfig.class);
         *
         **/
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello=applicationContext.getBean(Hello.class);
        hello.setMessage("Hello Config");
        System.out.println(hello.getMessage());

    }
}
