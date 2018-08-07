package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class Coffee extends Drink {
    public Coffee(){
        this.description = "Coffee";
    }

    @Override
    double cost() {
        return 10;
    }
}
