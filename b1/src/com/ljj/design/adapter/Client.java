package com.ljj.design.adapter;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class Client {
    public static void main(String[] args) {
//        Ps4 ps4 = new Adapter1();
        Ps4 ps4 = new Apdater2(new UsbImpl());
        ps4.isPs4();
    }
}
