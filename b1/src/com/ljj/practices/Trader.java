package com.ljj.practices;

/**
 * @author bce1100
 * @date 2018/9/14.
 */
public class Trader {
    private final String name;
    private final String city;
    public Trader(String name,String city){
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
