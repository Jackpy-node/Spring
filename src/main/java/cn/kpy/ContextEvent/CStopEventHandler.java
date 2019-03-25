package cn.kpy.ContextEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.ContextEvent
 * @data: 2019-3-25 8:50
 * @discription: 当上下文停止时，ContextStoppedEvent 发布
 **/
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("contextEvent stopped");
    }
}
