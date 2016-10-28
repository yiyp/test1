package com.org2;

/**
 * Created by yyp on 2016/10/27 0027.
 */
public class InitialTelphone {
    public static void main(String[] args) {
        Telphone phone = new Telphone();
        Telphone phone2 = new Telphone(5.0f, 1.4f, 2.0f);
        phone2.setScreen(6.0f);
        System.out.println("screen:" + phone2.getScreen());
    }
}
