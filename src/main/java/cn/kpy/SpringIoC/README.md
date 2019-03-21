#IoC容器（Inversion of Controller）
1. IoC容器负责实例化、定位、配置应用程序中的对象及建立这些对象间的依赖
##Spring IoC容器（提供两种不同的容器）
1. BeanFactory 容器
2. ApplicationContext 容器
##Bean的作用域（scope）
1. singleton：单例模式，内存中只存在同一类的唯一实例
2. prototype：原型模式，每次实例化类都生成新的对象
3. request：每次HTTP请求都会创建一个新的Bean
4. session：同一个HTTP Session共享一个Bean
5. global-session：一般用于Portlet应用环境，该运用域仅适用于WebApplicationContext环境
##Bean的继承
1. 通过bean的parent属性实现继承
2. 子Bean从父Bean中继承配置，包括Bean的属性配置，子Bean可以覆盖从父Bean继承过来的配置
##Bean的初始化和销毁
1. Bean的生命周期可以表达为：Bean的定义——Bean的初始化——Bean的使用——Bean的销毁
    1. 初始化（init-method属性）
        1. Bean的后置处理器（BeanPostProcessor）
            1. postProcessBeforeInitialization()
            2. postProcessAfterInitialization()
    2. 销毁（destroy-method属性）
2. Bean的后置处理器是对于Bean生命周期的init-method属性而言的
3. Bean的作用域scope为Singleton时，Bean的后置处理器只会执行一次



