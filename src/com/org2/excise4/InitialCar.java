package com.org2.excise4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class InitialCar {
    public static void main(String[] args) {

        // step 1:实例化车辆信息
        Car[] cars = {
                new Passenger("奥迪A4", 4, 500),
                new Passenger("马自达6", 4, 400),
                new TrunkPassenger("皮卡雪6", 4, 2, 450),
                new Passenger("金龙", 20, 800),
                new Trunk("松花江", 4, 400),
                new Trunk("依维柯", 20, 1000)
        };

        // step 2:输入是否租车
        try {
            System.out.println("****** 欢迎使用答答租车系统 ****** \n" + "您是否要租车：1是  0否");
            Scanner input = new Scanner(System.in);
            int is = input.nextInt();
            if (is == 1) {
                System.out.println("\n您可租车的类型及其价目表：\n" + "序号\t汽车名称\t租金\t\t\t容量");
                for (int i = 0; i < cars.length; i++) {
                    System.out.println(" " + (i + 1) + " .\t" + cars[i].toString());
                }

                // step 3：输入租车数量
                System.out.println("\n请输入您要租车的数量：");
                is = input.nextInt();

                String passengerNames = "";
                String trunkNames = "";
                int persons = 0;
                double duns = 0.0;
                double moneys = 0.0;
                for (int j = 0; j < is; j++) {

                    // step 4：依次输入需要租车的序号
                    System.out.println("请输入第" + (j + 1) + "辆车的序号：");
                    int order = input.nextInt();
                    if (order > 0 && order <= 6) {
                        String name = cars[order - 1].getName();
                        int person = cars[order - 1].getPerson();
                        double dun = cars[order - 1].getDun();
                        double money = cars[order - 1].getMoney();
                        if (!name.equals("")) {
                            System.out.println("您已经选择车辆为：" + name);
                        } // TODO 测试
                        if (money != 0.0) {
                            moneys += money;
                        }
                        if (person != 0) {
                            persons += person;
                            passengerNames += "\t\t" + name;
                        }
                        if (dun != 0.0) {
                            duns += dun;
                            trunkNames += "\t\t" + name;
                        }
                    }

                }
                System.out.println("\n您的账单：\n***载人的车有：" + passengerNames + "\t\t共载人：" + persons + "人" +
                        "\n***载货的车有：" + trunkNames + "\t\t共载货：" + duns + "吨" +
                        "\n***租车总价格：\t\t" + moneys);

            } else {
                System.out.println("您取消了租车！");
            }
        } catch (InputMismatchException e) {
            System.out.println("你应该输入整数！\n");
        }

        System.out.println("程序结束啦！");
    }

    /*
      * 判断是否为整数
      * @param str 传入的字符串
      * @return 是整数返回true,否则返回false
    */
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
