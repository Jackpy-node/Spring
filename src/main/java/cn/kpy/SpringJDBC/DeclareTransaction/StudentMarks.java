package cn.kpy.SpringJDBC.DeclareTransaction;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.ProgramTransaction
 * @data: 2019-4-2 21:23
 * @discription: 创建数据库实例实体对象
 **/
public class StudentMarks {
    private String name;
    private int age;
    private int id;
    private int marks;
    private int year;
    private int sid;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
