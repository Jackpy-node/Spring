package cn.kpy.JavaAnnotation.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.JavaAnnotation.Import
 * @data: 2019-3-25 8:09
 * @discription: @import 注解允许从另一个配置类中加载 @Bean 定义
 **/
@Configuration
public class ConfigA {
    @Bean
    public A a() {
        return new A();
    }
}
