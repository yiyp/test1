package com.org2.excise2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class Cellphone extends Telephone {
    @Override
    public void call() {
        System.out.println("通过键盘来打电话");
    }

    @Override
    public void message() {
        System.out.println("通过键盘来发短信");
    }
}
