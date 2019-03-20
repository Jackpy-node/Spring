package cn.kpy.SpringIoC.SpringStudent;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent
 * @data: 2019-3-18 14:53
 * @discription: IoC容器
 **/


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Spring IoC容器（提供两种不同的容器）：
 *      1、BeanFactory 容器
 *      2、ApplicationContext 容器
 */

public class SpringIoC {
    public static void main(String[] args) {
        /**
         * 1、BeanFactory在启动的时候不会创建bean实例,而是在getBean()的时候,才会创建bean的实例
         *      第一步（加载）：loadBeanDefinitions：加载资源文件
         *      第二步（解析）：XmlBeanDefinitionReader：解析资源文件
         *      第三步（注册）：BeanDefinitionRegistry：实例化beans文件中的对象
         */

        System.out.println("------------------BeanFactory 容器：----------------------");
        Resource resource = new ClassPathResource("IOCBeans.xml");
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        Student student = (Student) beanFactory.getBean("student");
        student.setName("James");
        student.setAge(15);
        System.out.println("BeanFactory IoC：" + student.getName() + "..." + student.getAge());

        /**
         * 2、最常被使用的 ApplicationContext 接口实现：
         *      FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径。
         *      ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
         *      WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
         */
        System.out.println("------------------ApplicationContext 容器：----------------------");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IOCBeans.xml");
        Student student1 = (Student) applicationContext.getBean("student");
        student1.setName("John");
        student1.setAge(20);
        System.out.println("Application IoC：" + student1.getName() + "...." + student1.getAge());
    }
}
