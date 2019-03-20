package cn.kpy.SpringIoC.SpringStudent;

import org.springframework.beans.BeansException;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringIoC.SpringStudent
 * @data: 2019-3-18 12:51
 * @discription: Bean后置处理器类
 **/
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean " + beanName + "postProcess Before Initialization");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean " + beanName + "postProcess After Initialization");
        return null;
    }
}
