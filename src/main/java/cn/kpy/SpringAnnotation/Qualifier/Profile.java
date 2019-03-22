package cn.kpy.SpringAnnotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAnnotation.Qualifier
 * @data: 2019-3-22 8:50
 * @discription: 为Profile类注入Student实例属性
 **/
public class Profile {
    @Autowired  //自动装配
    @Qualifier("student2")  //当存在多个student实例对象时，指定要加载哪一个实例
    private Student student;

    public Profile() {
        System.out.println("Inside Profile Constructor");
    }

    public void printName(){
        System.out.println("student name："+student.getName());
    }

    public void printAge(){
        System.out.println("student age："+student.getAge());
    }
}
