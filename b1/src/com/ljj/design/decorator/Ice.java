package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class Ice extends Condiment {
    Drink drink;
    public Ice(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+"add Ice";
    }

    @Override
    double cost() {
        return drink.cost()+0.2;
    }
}
