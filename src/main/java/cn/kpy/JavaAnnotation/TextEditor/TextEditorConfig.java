package cn.kpy.JavaAnnotation.TextEditor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.MainHello.Hello.Hello.TextEditor
 * @data: 2019-3-23 13:57
 * @discription: 通过@Configuration和@Bean进行注入，将XML注入方式转化为了Annotation注解方式
 **/
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
