package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public abstract class Drink {
    String description= "unknown drink";
    public String getDescription(){
        return this.description;
    }
    abstract double cost();

}
