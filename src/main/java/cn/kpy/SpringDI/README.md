#依赖注入-DI（Dependency Injection）
1. 相互独立的几个对象之间，通过Bean配置文件实现相互连接
##依赖注入的几种方式：
1. 通过Bean的配置文件依赖注入的方式：五种
    1. 依赖注入方式一：Spring基于构造函数实现依赖注入
        1. 构造函数传参：constructor(Object args...)
    2. 依赖注入方式二：Spring 基于设值函数的依赖注入
        1. 设值注入setter方法：setter(Object args...)
    3. 依赖注入方式三：自动装配-byName
        1. autowire="byName"，匹配属性变量中与配置文件中bean-id一致的类
    4. 依赖注入方式四：自动装配-byType
        1. autowire="byType"，匹配属性变量中属性与配置文件bean属性一致的类
    5. 依赖注入方式五：自动装配-constructor
        1. autowire="constructor"，自动通过构造方法进行依赖注入
##注：
###依赖注入方式分类：
1. 基于构造函数
    1. 依赖注入方式一：Spring基于构造函数实现依赖注入
        1. 构造函数传参：constructor(Object args...)
    2. 依赖注入方式五：自动装配-constructor
        1. autowire="constructor"，自动通过构造方法进行依赖注入
2. 基于设置函数
    1. 依赖注入方式二：Spring 基于设值函数的依赖注入
        1. 设值注入setter方法：setter(Object args...)
    2. 依赖注入方式三：自动装配-byName
        1. autowire="byName"，匹配属性变量中与配置文件中bean-id一致的类
    3. 依赖注入方式四：自动装配-byType
        1. autowire="byType"，匹配属性变量中属性与配置文件bean属性一致的类
        

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--Definition for spellChecker-->
    <bean id="spellChecker" class="cn.kpy.SpringDI.BeansDI.SpellChecker"></bean>

    <!--依赖注入方式一：Spring基于构造函数实现依赖注入-->
    <bean id="textEditor" class="cn.kpy.SpringDI.BeansDI.TextEditorConstructor">
        <constructor-arg ref="spellChecker"/>
    </bean>

    <!--依赖注入方式二：Spring 基于设值函数的依赖注入-->
    <bean id="textEditor1" class="cn.kpy.SpringDI.BeansDI.TextEditorSetValue">
        <property name="spellChecker" ref="spellChecker"></property>
    </bean>

    <!--依赖注入方式三：自动装配-byName，尝试将它的属性与配置文件中定义为相同名称的 beans 进行匹配和连接-->
    <bean id="textEditor2" class="cn.kpy.SpringDI.BeansDI.TextEditorSetValue" autowire="byName">
    </bean>

    <!--依赖注入方式四：自动装配-byType，它的type恰好与配置文件中beans名称中的一个相匹配，将尝试匹配和连接它的属性-->
    <bean id="textEditor3" class="cn.kpy.SpringDI.BeansDI.TextEditorSetValue" autowire="byType">
    </bean>

    <!--依赖注入方式五：自动装配-constructor-->
    <bean id="textEditor4" class="cn.kpy.SpringDI.BeansDI.TextEditorConstructor" autowire="constructor">
    </bean>

</beans>
```