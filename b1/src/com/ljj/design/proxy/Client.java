package com.ljj.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public class Client {
    public static void main(String[] args) {
/*        Car car = new Car();
        CarProxy carProxy = new CarProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carProxy);
        carLogProxy.move();*/

        Car car = new Car();
        InvocationHandler carHandler  = new CarHandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),car.getClass().getInterfaces(),carHandler);
        InvocationHandler carLogHandler = new CarLogHandler(m);
        Moveable mlog = (Moveable) Proxy.newProxyInstance(m.getClass().getClassLoader(),m.getClass().getInterfaces(),carLogHandler);
        mlog.move();
    }
}
