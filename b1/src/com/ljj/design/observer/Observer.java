package com.ljj.design.observer;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public abstract class Observer {
    /**
     * 更新接口
     * @param state 更新的状态
     */
    abstract void update(String state);
}
