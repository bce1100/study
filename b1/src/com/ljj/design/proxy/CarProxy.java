package com.ljj.design.proxy;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public class CarProxy implements Moveable{
    private Moveable m;
    public CarProxy(Moveable m){
        this.m = m;
    }


    @Override
    public void move() {
        System.out.println("我开了");
        m.move();
        System.out.println("开完了");
    }
}
