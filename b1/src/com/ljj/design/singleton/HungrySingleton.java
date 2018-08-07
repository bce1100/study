package com.ljj.design.singleton;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class HungrySingleton {
    private HungrySingleton(){}
    private static  HungrySingleton hungrySingleton =  new HungrySingleton();
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
