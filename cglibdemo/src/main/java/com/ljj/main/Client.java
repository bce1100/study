package com.ljj.main;

import com.ljj.demo.Hello;
import com.ljj.demo.HelloMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author bce1100
 * @date 2018/9/3.
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        Hello hello = (Hello) enhancer.create();
        hello.sayHello();
    }
}
