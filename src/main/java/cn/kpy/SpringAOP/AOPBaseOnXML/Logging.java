package cn.kpy.SpringAOP.AOPBaseOnXML;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringAOP.AOPBaseOnXML
 * @data: 2019-3-26 8:27
 * @discription: 基于XML配置文件的方式进行面向切面编程
 **/
public class Logging {

    //前置通知：在一个方法执行之前，执行通知
    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }

    //后置通知：在一个方法执行之后，不考虑其结果，执行通知
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    //返回后通知：在一个方法执行之后，只有在方法成功完成时，才能执行通知
    public void afterReturningAdvice(Object object) {
        System.out.println("Returning：" + object.toString());
    }

    //抛出异常后通知：在一个方法执行之后，只有在方法退出抛出异常时，才能执行通知
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
