# 事件（ApplicationContext Event）
## 一、Spring 提供了以下的标准事件：
### 1. ContextRefreshedEvent
  ApplicationContext 被初始化或刷新时，该事件被发布。这也可以在 ConfigurableApplicationContext 接口中使用 refresh() 方法来发生。 
### 2. ContextStartedEvent
  当使用 ConfigurableApplicationContext 接口中的 start() 方法启动 ApplicationContext 时，该事件被发布。你可以调查你的数据库，或者你可以在接受到这个事件后重启任何停止的应用程序。
### 3. ContextStoppedEvent
  当使用 ConfigurableApplicationContext 接口中的 stop() 方法停止 ApplicationContext 时，发布这个事件。你可以在接受到这个事件后做必要的清理的工作。
### 4. ContextClosedEvent
  当使用 ConfigurableApplicationContext 接口中的 close() 方法关闭 ApplicationContext 时，该事件被发布。一个已关闭的上下文到达生命周期末端；它不能被刷新或重启。
  
### 5. RequestHandledEvent
  这是一个 web-specific 事件，告诉所有 bean HTTP 请求已经被服务。
## 二、Spring事件实现方式：
实现ApplicationListener < ContextEvent > 接口