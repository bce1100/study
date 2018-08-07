package com.ljj.design.singleton;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class LazySingle {
    private LazySingle(){}
    private static LazySingle lazySingle = null;
    public static synchronized LazySingle getInstance(){
        if(lazySingle==null){
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
