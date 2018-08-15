package com.hand.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
public class HelloEvent extends ApplicationEvent{
    private String name;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public HelloEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
