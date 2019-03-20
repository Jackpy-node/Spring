package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.AutowiredSetter
 * @data: 2019-3-20 18:50
 * @discription: 属性中的 @AutowiredSetter，使用 为自动连接属性传递的时候，Spring 会将这些传递过来的值或者引用自动分配给那些属性
 **/
public class TextEditorProperty {

    @Autowired
    private SpellChecker spellChecker;

    public TextEditorProperty() {
        System.out.println("Inside TextEditor constructor." );
    }

    public void SpellCheck(){
        spellChecker.checkSpelling();
    }
}
