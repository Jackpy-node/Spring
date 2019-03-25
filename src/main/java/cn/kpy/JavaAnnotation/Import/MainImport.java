package cn.kpy.JavaAnnotation.Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.JavaAnnotation.Import
 * @data: 2019-3-25 8:12
 * @discription: @import 注解允许从另一个配置类中加载 @Bean 定义
 **/
public class MainImport {
    public static void main(String[] args) {
        //因为ConfigB类中使用Import注解方式注入了ConfigA类，所以只需指定ConfigB.class
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigB.class);
        A a=applicationContext.getBean(A.class);
        B b=applicationContext.getBean(B.class);

        //当使用 init-method 和 destroy-method 的时候，使用 prototype 时 Spring 不会负责销毁容器对象，即 Spring 不会调用 destroy-method 所指定的方法，所以需要去掉 scope 属性，使用默认的 singleton
        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();
    }
}
