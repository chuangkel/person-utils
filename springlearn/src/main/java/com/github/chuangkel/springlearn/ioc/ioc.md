### 
BeanNameAware接口是为了让自身Bean能够感知到，获取到自身在Spring容器中的id属性。
同理，其他的Aware接口也是为了能够感知到自身的一些属性。
比如实现了ApplicationContextAware接口的类，能够获取到ApplicationContext，实现了BeanFactoryAware接口的类，能够获取到BeanFactory对象。

### 设计到的设计模式
* 观察者模式 
    * ApplicationListener 和 ApplicationEvent
    