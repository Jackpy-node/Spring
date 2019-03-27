#Spring AOP（面向切面）
## 一、基于AOP的XML框架
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--execution(public * *(..))-->
    <!--任何一个以“set”开始的方法的执行：-->
    <!--execution(* set*(..))-->
    <!--AccountService 接口的任意方法的执行：-->
    <!--execution(* com.xyz.service.AccountService.*(..))-->
    <!--定义在service包里的任意方法的执行：-->
    <!--execution(* com.xyz.service.*.*(..))-->
    <!--定义在service包和所有子包里的任意类的任意方法的执行：-->
    <!--execution(* com.xyz.service..*.*(..))-->
    <!--定义在pointcutexp包和所有子包里的JoinPointObjP2类的任意方法的执行：-->
    <!--execution(* com.test.spring.aop.pointcutexp..JoinPointObjP2.*(..))")-->


    <bean id="logging" class="cn.kpy.SpringAOP.AOPBaseOnXML.Logging"></bean>

    <bean id="student" class="cn.kpy.SpringAOP.AOPBaseOnXML.Student">
        <property name="name" value="John"></property>
        <property name="age" value="25"></property>
    </bean>

    <aop:config>
        <aop:aspect id="log" ref="logging">
            <!--pointcut-id定义切入点id，后续五种通知通过pointcut-id关联切入点-->
            <aop:pointcut id="selectAll" expression="execution(* cn.kpy.SpringAOP.AOPBaseOnXML.*.*(..))"></aop:pointcut>
            <!--beforeAdvice在一个方法执行之前，执行通知-->
            <aop:before pointcut-ref="selectAll" method="beforeAdvice"></aop:before>
            <!--afterAdvice在一个方法执行之后，进行通知-->
            <aop:after pointcut-ref="selectAll" method="afterAdvice"></aop:after>
            <!--afterReturningAdvice在一个方法执行之后，只有在方法成功完成时，才能执行通知，注意返回值：returning="object"-->
            <aop:after-returning pointcut-ref="selectAll" returning="object" method="afterReturningAdvice"></aop:after-returning>
            <!--AfterThrowingAdvice在一个方法执行之后，只有在方法退出抛出异常时，才能执行通知，注意异常对象实例：throwing="ex"-->
            <aop:after-throwing pointcut-ref="selectAll" method="AfterThrowingAdvice" throwing="ex"></aop:after-throwing>
        </aop:aspect>
    </aop:config>

</beans>
```

## 二、基于AOP的@AspectJ注解
### 1、声明一个 aspect

```java
package cn.kpy.SpringAOP.AOPBaseAspectJ;

import org.aspectj.lang.annotation.*;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAOP.AOPBaseAspectJ
 * @data: 2019-3-26 21:17
 * @discription: 基于@AspectJ注解方式进行面向切面编程
 **/

/**此处特别需要注意，将类定义为@Aspect切面对象类*/
@Aspect
public class Logging {
    
}
```

### 2、声明一个切入点pointcut
```java
    @Pointcut("execution(* cn.kpy.SpringAOP.AOPBaseAspectJ.*.*(..))")
    private void selectAll(){}
```
### 3. 申明建议
```java
    //前置通知：在一个方法执行之前，执行通知
    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }

    //后置通知：在一个方法执行之后，不考虑其结果，执行通知
    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    //返回后通知：在一个方法执行之后，只有在方法成功完成时，才能执行通知,注意返回值：returning = "object"
    @AfterReturning(pointcut = "selectAll()", returning = "object")
    public void afterReturningAdvice(Object object) {
        System.out.println("Returning：" + object.toString());
    }

    //抛出异常后通知：在一个方法执行之后，只有在方法退出抛出异常时，才能执行通知，注意异常对象实例：throwing = "ex"
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
```
### 4、配置Beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--注意：引入AOP AspectJ自动代理-->
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>

    <bean id="student" class="cn.kpy.SpringAOP.AOPBaseAspectJ.Student">
        <property name="name" value="John"></property>
        <property name="age" value="20"></property>
    </bean>

    <bean id="logging" class="cn.kpy.SpringAOP.AOPBaseAspectJ.Logging"></bean>

</beans>
```