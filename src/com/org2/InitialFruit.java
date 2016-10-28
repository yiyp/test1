package com.org2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class InitialFruit {

    public static void main(String[] args) {
        Fruit obj1 = new Fruit();
        Fruit obj2 = new Pear();
        Fruit obj3 = new Banana();
        // Pear obj3 = new Fruit(); 错误的（多态）
        obj1.eat();
        obj2.eat();
        obj3.eat();
    }
}
