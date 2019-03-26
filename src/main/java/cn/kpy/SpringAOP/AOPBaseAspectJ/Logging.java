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

    @Pointcut("execution(* cn.kpy.SpringAOP.AOPBaseAspectJ.*.*(..))")
    private void selectAll(){}


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
}
