package com.hand.handler;

import com.hand.event.MailEvent1;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
@Component
public class MailEventHandler {

    @EventListener
    public void handle1(ApplicationEvent applicationEvent){//MailEvent1 mailEvent1
        if(applicationEvent instanceof MailEvent1){
            MailEvent1 mailEvent1 = (MailEvent1) applicationEvent;
            //        mailEvent1.getMail();
            System.out.println("收件人:\t" + mailEvent1.getRecipients());
            System.out.println("收到主题为:\t" + mailEvent1.getSubject());
            System.out.println("正文内容为: \t" + mailEvent1.getContent());
        }

    }


}
