package cn.kpy.SpringAnnotation.Required;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Required
 * @data: 2019-3-20 18:08
 * @discription: @Required 注释应用于 bean 属性的 setter 方法，它表明受影响的 bean 属性在配置时必须放在 XML 配置文件中，否则容器就会抛出一个 BeanInitializationException 异常
 **/
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    //@Required注解已经不再使用
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //@Autowired 的（required=false）选项，默认情况下，@Autowired注释意味着依赖是必须的，它类似于@Required注释
    @Autowired
    public void setAge(int age) {
        this.age = age;
    }
}
