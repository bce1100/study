package com.ljj.design.adapter;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class Adapter1 extends UsbImpl implements Ps4 {

    @Override
    public void isPs4() {
        System.out.println("我的PS4用上类适配器插上");
        this.isUsb();
    }
}
