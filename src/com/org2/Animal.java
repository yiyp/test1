package com.org2;

import java.util.Objects;

/**
 * Created by yiyp on 2016/10/27 0027.
 */

// public class Animal {
public class Animal extends Object {
    public int age = 10;
    public String name;
    public void eat() {
        System.out.println("年龄：" +age+ "，动物具有吃东西的能力！");
    }

    /*public Animal() {
        System.out.println("Animal类构造方法开始执行了。");
       // age = 20;
    }*/

    /*public Animal(int age) {
        this.age = age;
    }*/
}

