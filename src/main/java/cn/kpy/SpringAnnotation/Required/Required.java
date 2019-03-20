package cn.kpy.SpringAnnotation.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Required
 * @data: 2019-3-20 18:37
 * @discription: @Required 注释应用于 bean 属性的 setter 方法，它表明受影响的 bean 属性在配置时必须放在 XML 配置文件中，否则容器就会抛出一个 BeanInitializationException 异常
 **/
public class Required {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student.getName()+"..."+student.getAge());
    }
}
