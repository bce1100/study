package com.ljj.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public abstract class Subject {
    /**
     * 用于保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者
     * @param observer 观察者对象
     */
    public void attach(Observer observer){
        list.add(observer);
        System.out.println("成功注册一名观察者");
    }

    /**
     * 删除观察者
     * @param observer 观察者对象
     */
    public void detach(Observer observer){
        list.remove(observer);
        System.out.println("已删除一名观察者");
    }

    /**
     * 通知所有注册的观察者对象
     * @param newState
     */
    public void notifyObsercer(String newState){
        for(Observer observer:list){
            observer.update(newState);
        }
    }
}
