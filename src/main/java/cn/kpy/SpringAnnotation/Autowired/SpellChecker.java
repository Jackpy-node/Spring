package cn.kpy.SpringAnnotation.Autowired;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-19 8:48
 * @discription: 创建依赖类文件 SpellChecker.java
 **/
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor");
    }

    public void checkSpelling(){
        System.out.println("Inside checkSpelling");
    }
}
