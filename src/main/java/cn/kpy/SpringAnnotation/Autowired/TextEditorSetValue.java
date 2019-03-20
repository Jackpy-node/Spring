package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.AutowiredSetter
 * @data: 2019-3-20 18:43
 * @discription: Setter()方法中使用 @AutowiredSetter 注解方式自动装配
 **/
public class TextEditorSetValue {

    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void SpellCheck(){
        spellChecker.checkSpelling();
    }
}
