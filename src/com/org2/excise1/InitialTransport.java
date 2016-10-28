package com.org2.excise1;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class InitialTransport {
    public static void main(String[] args) {
        /*Transport ts1 = new Airplane();
        Transport ts2 = new Bicycle();
        Transport ts3 = new Car();
        Transport ts4 = new Ship();
        Transport ts5 = new Train();
        Transport ts6 = new Truck();

        ts1.usage();
        ts2.usage();
        ts3.usage();
        ts4.usage();
        ts5.usage();
        ts6.usage();*/

         /*Airplane air = new Airplane();
         Transport tran = air;
         Airplane air2 = (Airplane)tran;
         Transport tran = new Transport();
         Bicycle by = (Bicycle) tran;*/

        Airplane air = new Airplane();
        Transport tran = air;
        if (tran instanceof Airplane) {
            Airplane air2 = (Airplane)tran;
        } else {
            System.out.println("无法进行类型转换，转换成Airplane！");
        }
        if (tran instanceof Bicycle) {
            Bicycle by = (Bicycle)tran;
        } else {
            System.out.println("无法进行类型转换，转换成Bicycle！");
        }
    }
}
