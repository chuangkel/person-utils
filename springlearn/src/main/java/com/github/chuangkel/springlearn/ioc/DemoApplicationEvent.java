package com.github.chuangkel.springlearn.ioc;

import org.springframework.context.ApplicationEvent;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-29 16:21
 **/
public class DemoApplicationEvent extends ApplicationEvent {
    private String eventName;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoApplicationEvent(Object source) {
        super(source);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public DemoApplicationEvent(Object source, String eventName) {
        super(source);
        this.eventName = eventName;
    }
}
