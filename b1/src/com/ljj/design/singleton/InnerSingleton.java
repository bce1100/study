package com.ljj.design.singleton;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    private static class SingletonHolder {
        private static InnerSingleton innerSingleton = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.innerSingleton;
    }
}
