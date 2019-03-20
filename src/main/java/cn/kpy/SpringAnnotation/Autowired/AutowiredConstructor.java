package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Autowired
 * @data: 2019-3-20 19:09
 * @discription: 构造函数中的@Autowired，一个构造函数@Autowired说明当创建bean时，即使在XML文件中没有使用元素配置bean，构造函数也会被自动连接
 **/
public class AutowiredConstructor {
    public static void main(String[] args) {
        // 3、构造方法@Autowired注解自动装配
        System.out.println("构造方法@Autowired注解自动装配：");
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        TextEditorConstructor textEditor2= (TextEditorConstructor) applicationContext.getBean("textEditor2");
        textEditor2.SpellCheck();
    }
}
