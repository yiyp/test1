package com.org3.excise3;

/**
 * Created by yiyp on 2016/10/28 0028.
 * demo1: Integer包装类的常用方法
 * demo2: 手动装箱   自动装箱
 * demo3: 基本类型和字符串之间的转换
 */
public class IntegerDemo {
    public static void main(String[] args) {

        /*// demo1
        // 定义int类型变量，值为86
        int score1 = 86;

        // 创建Integer包装类对象，表示变量score1的值
        Integer score2=new Integer(score1);

        // 将Integer包装类转换为double类型
        double score3=score2.doubleValue();

        // 将Integer包装类转换为float类型
        float score4=score2.floatValue();

        // 将Integer包装类转换为int类型
        int score5 =score2.intValue();

        System.out.println("Integer包装类：" + score2);
        System.out.println("double类型：" + score3);
        System.out.println("float类型：" + score4);
        System.out.println("int类型：" + score5);*/


        /*// demo2
        // 定义double类型变量
        double a = 91.5;

        // 手动装箱
        Double b = new Double(a);

        // 自动装箱
        Double c = a;

        System.out.println("装箱后的结果为：" + b + "和" + c);

        // 定义一个Double包装类对象，值为8
        Double d = new Double(87.0);

        // 手动拆箱
        double e = d.doubleValue();

        // 自动拆箱
        double f = d;

        System.out.println("拆箱后的结果为：" + e + "和" + f);*/


        // demo 3
        // String --> double
        // double d = Double.parseDouble("1.0");
        // String --> float
        // float f = Float.parseFloat("1.0f");
        // String --> int
        // int i = Integer.parseInteger("123");

        double m = 78.5;
        //将基本类型转换为字符串
        String str1 = Double.toString(m);

        System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1+20));

        String str = "180.20";
        // 将字符串转换为基本类型
        double a = Double.parseDouble(str);

        System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
    }
}
