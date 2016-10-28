package com.org2.excise4;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class TrunkPassenger extends Car {
    private String name;
    private int person;
    private int dun;
    private int money;

    public TrunkPassenger(String name, int person, int dun, int money){
        this.name = name;
        this.person = person;
        this.dun = dun;
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
    public double getDun() {
        return dun;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return name + "\t\t" + money + "元/天 " + "\t\t载人：" + person + "人\t载货：" + dun + "吨";
    }
}
