package com.ljj.design.adapter;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class UsbImpl implements Usb {

    @Override
    public void isUsb() {
        System.out.println("usb插头");
    }
}
