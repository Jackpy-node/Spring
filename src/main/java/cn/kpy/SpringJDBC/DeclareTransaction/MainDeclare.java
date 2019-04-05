package cn.kpy.SpringJDBC.DeclareTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.SpringJDBC.DeclareTransaction
 * @data: 2019-4-3 8:44
 * @discription: 编程式事务管理
 **/
public class MainDeclare {
    public static void main(String[] args) {

        /** AOP 代理方式一(隐式代理)：
         * 注意：
         *      StudentMarksImpl实现了StudentDAO接口，且Bean采用AOP思想进行事务管理，StudentMarksImpl为AOP的目标类
         *      目标对象的实现类实现了接口，Spring AOP 将会采用 JDK 动态代理来生成 AOP 代理类
         *      <aop:config expose-proxy="false" proxy-target-class="false">
         *      默认expose-proxy为false，即不会将代理暴露出来，所以导致AOP选择目标类是，切入失败
         *      expose-proxy设为true之后，自动将代理暴露，所以如下方式可以进行AOP切面的事务管理
         *
         *      <!--切入点定义方式一：AOP expose-proxy属性为true暴露代理，proxy-target-class="true" 为true时，表示使用CGLib动态代理技术来实现增强处理-->
         *     <aop:config expose-proxy="true" proxy-target-class="true">
         *         <aop:pointcut id="Create" expression="execution(* cn.kpy.SpringJDBC.DeclareTransaction.StudentMarksImpl.Create(..))"></aop:pointcut>
         *         <!-- 定义织入点规则 -->
         *         <aop:advisor advice-ref="txAdvice" pointcut-ref="Create"></aop:advisor>
         *     </aop:config>
         **/
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DeclareTransaction.xml");
        StudentMarksImpl studentDAOImpl = (StudentMarksImpl) applicationContext.getBean("studentMarksImpl");*/


        /** AOP 代理方式二（显式代理）：
         * 1. 如果目标对象的实现类实现了接口，Spring AOP 将会采用 JDK 动态代理来生成 AOP 代理类
         * 2. 如果目标对象的实现类没有实现接口，Spring AOP 将会采用 CGLIB 来生成 AOP 代理类
         *
         *     <!--切入点定义方式二：AOP expose-proxy属性默认为false不暴露代理，但需要进行目标类转换为父类接口-->
         *     <aop:config>
         *         <aop:pointcut id="Create" expression="execution(* cn.kpy.SpringJDBC.DeclareTransaction.StudentMarksImpl.Create(..))"></aop:pointcut>
         *         <!-- 定义织入点规则 -->
         *         <aop:advisor advice-ref="txAdvice" pointcut-ref="Create"></aop:advisor>
         *     </aop:config>
         *
         **/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("DeclareTransaction.xml");
        StudentDAO studentDAO= (StudentDAO) applicationContext.getBean("studentMarksImpl");

        System.out.println("...Records Condition...");
        studentDAO.Create("Zara",20,1, 1994);
        studentDAO.Create("Lay",22,2, 1993);
        System.out.println("Query All Records...");
    }
}
