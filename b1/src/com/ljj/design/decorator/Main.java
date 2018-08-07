package com.ljj.design.decorator;

/**
 * @author bce1100
 * @date 2018/8/7.
 */
public class Main {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        System.out.println("咖啡什么都不加 "+coffee.getDescription()+coffee.cost());
        Drink milk = new Milk();
        Drink drinks = new Sugar(milk);
        Drink drinkis = new Ice(drinks);
        System.out.println("牛奶加东西"+drinkis.getDescription()+" "+drinkis.cost());
    }
}
