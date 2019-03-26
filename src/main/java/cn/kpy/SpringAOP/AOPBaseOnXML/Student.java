package cn.kpy.SpringAOP.AOPBaseOnXML;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAOP.AOPBaseOnXML
 * @data: 2019-3-26 8:34
 * @discription: 基于XML配置文件的方式进行面向切面编程
 **/
public class Student {
    private int age;
    private String name;

    public int getAge() {
        System.out.println("Age："+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name："+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException(){
        System.out.println("Exception");
        throw new IllegalArgumentException();
    }

}
