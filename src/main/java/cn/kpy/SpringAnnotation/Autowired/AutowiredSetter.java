package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.AutowiredSetter
 * @data: 2019-3-20 18:46
 * @discription: Setter()方法中使用 @Autowired注解方式自动装配
 **/
public class AutowiredSetter {
    public static void main(String[] args) {
        // 1、Setter()方法中使用 @Autowired注解方式自动装配
        System.out.println("Setter方法中使用@Autowired注解：");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        TextEditorSetValue textEditor= (TextEditorSetValue) applicationContext.getBean("textEditor");
        textEditor.SpellCheck();
    }
}
