package cn.kpy.SpringDI.CollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection
 * @data: 2019-3-20 8:14
 * @discription: 注入集合
 **/
public class CollectionsDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("CollectionBeans.xml");
        Collections collections= (Collections) applicationContext.getBean("collections");
        collections.getList();
        collections.getMap();
        collections.getSet();
        collections.getProperties();
    }
}
