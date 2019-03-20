package cn.kpy.SpringIoC.SpringStudent;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent.SpringStudent
 * @data: 2019-3-15 11:03
 * @discription: 学生类基础类
 **/
public class Student implements BeanPostProcessor {
    private String name;
    private int age;
    private String sex;

    public String getSex() {
        System.out.println("父类getSex："+sex);
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("父类setSex："+sex);
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init(){
        System.out.println("Student Bean init");
    }

    public void destroy(){
        System.out.println("Student Bean destroy");
    }
}
