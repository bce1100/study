package com.ljj.design.singleton;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public enum EnumSingleton {
    uniqueSingleton;

    //单例模式的资源
    private Resource resource;
    EnumSingleton(){
        resource = new Resource();
    }
    //获取实例只需EnumSingleton.uniqueSingleton.getInsatnce()即可获得Resource单例
    public Resource getInstance(){
        return resource;
    }
}
