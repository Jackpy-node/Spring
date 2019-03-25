package cn.kpy.JavaAnnotation.TextEditor;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.JavaAnnotation.TextEditor
 * @data: 2019-3-23 13:59
 * @discription: 创建依赖目标类
 **/
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor Constructor");
        this.spellChecker=spellChecker;
    }

    public void SpellCheck(){
        spellChecker.checkSpelling();
    }
}
