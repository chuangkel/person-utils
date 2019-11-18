package com.github.chuangkel.springlearn.ioc;

import org.springframework.context.ApplicationListener;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-29 16:21
 **/
public class DemoApplicationListener implements ApplicationListener<DemoApplicationEvent> {
    @Override
    public void onApplicationEvent(DemoApplicationEvent event) {

        if(event !=null){
            System.out.println("事件名称："+event.getEventName());
        }
    }
}
