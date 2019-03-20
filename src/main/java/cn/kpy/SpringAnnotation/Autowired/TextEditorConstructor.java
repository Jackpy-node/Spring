package cn.kpy.SpringAnnotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Autowired
 * @data: 2019-3-20 19:07
 * @discription: 构造函数中的 @Autowired，一个构造函数 @Autowired 说明当创建 bean 时，即使在 XML 文件中没有使用 元素配置 bean ，构造函数也会被自动连接
 **/
public class TextEditorConstructor {

    private SpellChecker spellChecker;

    @Autowired
    public TextEditorConstructor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void SpellCheck(){
        spellChecker.checkSpelling();
    }
}
