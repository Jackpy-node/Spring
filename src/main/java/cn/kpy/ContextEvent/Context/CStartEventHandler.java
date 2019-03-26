package cn.kpy.ContextEvent.Context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.ContextEvent
 * @data: 2019-3-25 8:47
 * @discription: 当上下文启动时，ContextStartedEvent 发布
 **/
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("contextEvent start");
    }
}
