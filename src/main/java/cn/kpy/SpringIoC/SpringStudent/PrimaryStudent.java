package cn.kpy.SpringIoC.SpringStudent;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent
 * @data: 2019-3-18 21:05
 * @discription: 定义学生的子类：primary student
 **/
public class PrimaryStudent {
    private String name;
    private int age;
    private String sex;

    public String getSex() {
        System.out.println("子类getSex："+sex);
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("子类setSex："+sex);
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


}
