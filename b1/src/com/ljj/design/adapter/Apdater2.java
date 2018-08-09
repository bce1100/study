package com.ljj.design.adapter;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class Apdater2 implements Ps4 {
    Usb usb;

    public Apdater2() {
    }

    public Apdater2(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs4() {
        System.out.println("我的PS4用上对象适配器插上");
        this.usb.isUsb();
    }
}
