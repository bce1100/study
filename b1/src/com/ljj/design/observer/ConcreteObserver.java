package com.ljj.design.observer;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class ConcreteObserver extends Observer {
    /**
     * 观察者状态
     */
    private String observerState;


    @Override
    void update(String state) {
        //更新观察者状态
        observerState = state;
        System.out.println("状态为："+observerState);
    }
}
