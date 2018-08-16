package com.ljj.design.proxy;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public class CarLogProxy implements Moveable {
    private Moveable m;
    public CarLogProxy(Moveable m){
        this.m = m;
    }


    @Override
    public void move() {
        System.out.println("开车日志记录开始");
        m.move();
        System.out.println("开车日志记录结束");
    }
}
