package cn.kpy.JavaAnnotation.Hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.MainHello
 * @data: 2019-3-23 12:51
 * @discription: @Configuration 和 @Bean 注解
 * 带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。@Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean
 **/

@Configuration
public class HelloConfig {

    @Bean
    public Hello HelloConfig() {
        return new Hello();
    }
}
