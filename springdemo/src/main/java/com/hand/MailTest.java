package com.hand;

import com.hand.event.MailEvent1;
import com.hand.handler.MailEventHandler;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
public class MailTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        ApplicationEventPublisher mailPublisher = applicationContext;

        Scanner input = new Scanner(System.in);
        System.out.println("输入收件人:");
        String recipients = input.nextLine();
        System.out.println("输入主题：");
        String subject = input.nextLine();
        System.out.println("输入正文：");
        String content = input.nextLine();
        mailPublisher.publishEvent(new MailEvent1(new MailTest(), recipients, subject, content));
    }
}
