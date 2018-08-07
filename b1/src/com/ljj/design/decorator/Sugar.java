package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class Sugar extends Condiment {
    Drink drink;
    public Sugar(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+"add Sugar";
    }

    @Override
    double cost() {
        return drink.cost()+0.5;
    }
}
