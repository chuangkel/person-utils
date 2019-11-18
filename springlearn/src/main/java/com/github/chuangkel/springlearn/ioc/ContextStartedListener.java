package com.github.chuangkel.springlearn.ioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-29 16:23
 **/
public class ContextStartedListener implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {

        DemoApplicationListener listener =  event.getApplicationContext()
                .getBean("listener",DemoApplicationListener.class);
        if(listener == null){
            System.out.println("没有获得listener");
        }else{
            System.out.println("获得listener");
        }

    }
}
