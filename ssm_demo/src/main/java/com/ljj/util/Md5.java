package com.ljj.util;

import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
public class Md5 {
    public static String getMD5(String password){
        String md5Password = null;
        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }
            md5Password = buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5Password;
    }

    @Test
    public void demo1(){
        System.out.println(        getMD5("123456")
);
    }
}