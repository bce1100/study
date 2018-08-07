package com.ljj.design.observer;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class ConcreteSubject extends Subject {
    private String state;
    public String getState(){
        return this.state;
    }
    public void change(String newState){
        this.state = newState;
        System.out.println("主题状态为："+state);
        //状态发生变化，通知观察者
        this.notifyObsercer(state);

    }
}
