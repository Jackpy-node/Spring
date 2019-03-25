package cn.kpy.JavaAnnotation.TextEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.JavaAnnotation.TextEditor
 * @data: 2019-3-25 8:03
 * @discription:
 **/
public class MainTextEditor {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor=applicationContext.getBean(TextEditor.class);
        textEditor.SpellCheck();
    }
}
