package cn.kpy.SpringDI.BeansDI;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-19 21:02
 * @discription: 创建一个显示类TextEditor，基于设值函数的依赖注入
 **/
public class TextEditorSetValue {

    private SpellChecker spellChecker;

    // a setter method to inject the dependency.
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // a getter method to return spellChecker
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
