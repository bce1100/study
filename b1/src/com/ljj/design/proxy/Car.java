package com.ljj.design.proxy;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("滴滴滴滴");
    }
}
