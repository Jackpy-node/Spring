package cn.kpy.SpringAnnotation.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation
 * @data: 2019-3-22 8:48
 * @discription: 当你创建多个具有相同类型的 bean 时，并且想要用一个属性只为它们其中的一个进行装配，在这种情况下，你可以使用@Qualifier注释和@Autowired注释通过指定哪一个真正的bean将会被装配来消除混乱
 **/
public class Qualifier {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        Profile profile= (Profile) applicationContext.getBean("profile");
        profile.printName();
        profile.printAge();
    }
}
