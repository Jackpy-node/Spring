package cn.kpy.SpringDI.BeansDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-19 8:58
 * @discription: 测试类
 **/
public class DependencyInjection {
    public static void main(String[] args) {
        //基于构造函数的依赖注入
        System.out.println("基于构造函数的依赖注入：");
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("DIBeans.xml");
        TextEditorConstructor textEditor= (TextEditorConstructor) applicationContext.getBean("textEditor");
        textEditor.spellCheck();

        //基于设值函数的依赖注入
        System.out.println("基于设值函数的依赖注入：");
        TextEditorSetValue textEditor1= (TextEditorSetValue) applicationContext.getBean("textEditor1");
        textEditor1.spellCheck();

        //通过byName自动装配
        System.out.println("通过byName自动装配：");
        TextEditorSetValue textEditor2= (TextEditorSetValue) applicationContext.getBean("textEditor2");
        textEditor2.spellCheck();

        //通过byType自动装配
        System.out.println("通过byType自动装配：");
        TextEditorSetValue textEditor3= (TextEditorSetValue) applicationContext.getBean("textEditor3");
        textEditor3.spellCheck();

        //通过constructor自动装配
        System.out.println("通过constructor自动装配：");
        TextEditorConstructor textEditor4= (TextEditorConstructor) applicationContext.getBean("textEditor4");
        textEditor4.spellCheck();
    }
}
