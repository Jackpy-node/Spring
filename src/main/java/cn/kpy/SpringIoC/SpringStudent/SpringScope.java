package cn.kpy.SpringIoC.SpringStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent
 * @data: 2019-3-18 14:56
 * @discription: Spring IoC中Bean的属性scope
 **/
public class SpringScope {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IOCBeans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("Application IoC：" + student.getName() + "...." + student.getAge());

        /**
         * Spring IoC中Bean的属性scope
         *      1、Singleton：单例模式
         *      2、Prototype：原型模式
         */

        //Bean属性为：Singleton，单例类，在创建起容器时就同时自动创建了一个bean的对象，不管你是否使用，他都存在了，每次获取到的对象都是同一个对象。注意，Singleton作用域是Spring中的缺省作用域
        System.out.println("------------------Bean的属性scope：Singleton：单例模式----------------------");
        Student SingletonStudent = (Student) applicationContext.getBean("student2");
        System.out.println("Singleton Student Bean：" + SingletonStudent.getName() + "..." + SingletonStudent.getAge());

        //Bean属性为：prototype，原型类型，Prototype是原型类型，它在我们创建容器的时候并没有实例化，而是当我们获取bean的时候才会去创建一个对象，而且我们每次获取到的对象都不是同一个对象
        System.out.println("------------------Bean的属性scope：Prototype：原型模式----------------------");
        Student PrototypeStudent = (Student) applicationContext.getBean("student1");
        System.out.println("Prototype Student Bean：" + PrototypeStudent.getName() + "..." + PrototypeStudent.getAge());

        /**
         * Spring IoC中Bean的生命周期
         *      1、init-method
         *      2、destroy-method
         * 注：scope为prototype的bean，容器会将创建好的对象实例返回给请求方，之后，容器就不再拥有其引用，请求方需要自己负责当前对象后继生命周期的管理工作，包括该对象的销毁。
         *     所以：scope为singleton的bean的destroy方法则是在容器关闭时执行，而scope为prototype的bean是不会执行destroy方法的。
         */
        System.out.println("------------------Bean的生命周期：----------------------");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println("Application IoC：" + student2.getName() + "...." + student2.getAge());
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    }
}
