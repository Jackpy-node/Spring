package cn.kpy.JavaAnnotation.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.JavaAnnotation.Import
 * @data: 2019-3-25 8:11
 * @discription: @import 注解允许从另一个配置类中加载 @Bean 定义
 **/
@Configuration
@Import(ConfigA.class)
public class ConfigB {
    //通过@Bean注解的initMethod和destroyMethod属相，进行Bean的初始化和销毁
    @Bean(initMethod = "initB", destroyMethod = "destroyB")
    //通过@Scope指定创建Bean的模式,当使用 init-method 和 destroy-method 的时候，使用 prototype 时 Spring 不会负责销毁容器对象，即 Spring 不会调用 destroy-method 所指定的方法，所以需要去掉 scope 属性，使用默认的 singleton
    @Scope("singleton")
    public B b() {
        return new B();
    }
}
