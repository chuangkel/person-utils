package com.github.chuangkel.springlearn.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoRunner {

    /**
     * @param args 观察者模式
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:/spring-context-application-listener.xml");

        context.start();

        String targetObj = "i am the target object";
        DemoApplicationEvent event = new DemoApplicationEvent(targetObj);
        event.setEventName("event name");
        context.publishEvent(event);

        Thread.sleep(3000);
        context.close();
    }

}
