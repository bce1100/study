package com.ljj.design.singleton;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class DoubleCheckSingleton {
    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
