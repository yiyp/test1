package com.org2.excise4;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class Trunk extends Car {
    private String name;
    private int dun;
    private int money;

    public Trunk(String name, int dun, int money){
        this.name = name;
        this.dun = dun;
        this.money = money;
    }

    @Override
    public String getName() {
        return name;
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
        return name + "\t\t" + money + "元/天\t\t" + "载货：" + dun + "吨";
    }
}
