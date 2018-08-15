package com.hand.handler;

import com.hand.event.HelloEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
@Component
public class HelloEventHandler {
    @EventListener
    public void handle(HelloEvent event){
        System.out.println("hello"+event.getName());
    }
}
