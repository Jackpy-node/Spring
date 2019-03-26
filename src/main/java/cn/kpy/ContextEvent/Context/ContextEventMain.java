package cn.kpy.ContextEvent.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.ContextEvent
 * @data: 2019-3-25 8:52
 * @discription: Spring 的核心是 ApplicationContext，它负责管理 beans 的完整生命周期。当加载 beans 时，ApplicationContext 发布某些类型的事件。例如，当上下文启动时，ContextStartedEvent 发布，当上下文停止时，ContextStoppedEvent 发布
 **/
public class ContextEventMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("XMLBeans.xml");
        HelloMessage helloMessage = (HelloMessage) applicationContext.getBean("helloMessage");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        helloMessage.setMessage("Hello Context Event");
        System.out.println("Your Message：" + helloMessage.getMessage());
        ((ClassPathXmlApplicationContext) applicationContext).stop();

    }
}
