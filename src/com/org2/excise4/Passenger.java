package com.org2.excise4;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class Passenger extends Car {
    private String name;
    private int person;
    private int money;

    public Passenger(String name, int person, int money){
        this.name = name;
        this.person = person;
        this.money = money;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPerson() {
        return person;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return name + "\t\t" + money + "元/天 " + "\t\t载人：" + person + "人";
    }
}
