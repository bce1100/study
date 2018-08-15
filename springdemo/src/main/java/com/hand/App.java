package com.hand;

import com.hand.event.HelloEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
public class App {
    public static void main(String[] args) {
        //绝对路径
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\idea_station\\study\\springdemo\\src\\main\\resources\\ioc.xml");
        //相对路径
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("ioc.xml");
//        System.out.println(applicationContext.getBean(String.class));
//        System.out.println(applicationContext.getBean("hand"));

        //单例作用域只在同一个容器中
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("ioc.xml");
//        System.out.println(applicationContext1.getBean("hand")==applicationContext2.getBean("hand"));
//        System.out.println(applicationContext1.getBean("movie"));

        ApplicationEventPublisher applicationEventPublisher = applicationContext1;
        applicationEventPublisher.publishEvent(new HelloEvent(new App(),"hand"));
    }

}
