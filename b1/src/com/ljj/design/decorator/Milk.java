package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class Milk extends Drink {
    public Milk(){
        this.description = "Milk";
    }

    @Override
    double cost() {
        return 5;
    }
}
