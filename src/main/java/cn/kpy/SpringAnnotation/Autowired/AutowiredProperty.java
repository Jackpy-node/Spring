package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Autowired
 * @data: 2019-3-20 19:02
 * @discription: 属性中的 @Autowired注解自动装配
 **/
public class AutowiredProperty {
    public static void main(String[] args) {
        // 2、属性中的@Autowired注解自动装配
        System.out.println("属性中使用@Autowired注解：");
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        TextEditorProperty textEditor1= (TextEditorProperty) applicationContext.getBean("textEditor1");
        textEditor1.SpellCheck();
    }
}
