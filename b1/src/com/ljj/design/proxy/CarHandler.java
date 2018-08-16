package com.ljj.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public class CarHandler implements InvocationHandler {
    private Object obj;

    public CarHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开车了");
        method.invoke(obj);
        System.out.println("开完了");
        return null;
    }
}
