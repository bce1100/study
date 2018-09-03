package com.ljj.demo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author bce1100
 * @date 2018/9/3.
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("BEFORE:"+method.getName());
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("AFTER:"+method.getName());
        return object;
    }
}
