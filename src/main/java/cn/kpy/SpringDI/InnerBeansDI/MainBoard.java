package cn.kpy.SpringDI.InnerBeansDI;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection.InnerBeansDI
 * @data: 2019-3-20 8:39
 * @discription: 内部主板类
 **/
public class MainBoard {
    public MainBoard() {
        System.out.println("Inside MainBoard Constructor");
    }
    public void Function(){
        System.out.println("MainBoard Running");
    }
}
