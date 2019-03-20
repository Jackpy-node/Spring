package cn.kpy.SpringDI.BeansDI;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-19 8:47
 * @discription: 创建一个显示类TextEditor，基于构造函数的依赖注入
 **/
public class TextEditorConstructor {

    private SpellChecker spellChecker;

    public TextEditorConstructor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditorConstructor constructor");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
