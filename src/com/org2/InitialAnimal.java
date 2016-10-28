package com.org2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */

public class InitialAnimal {

    public static void main(String[] args) {
         /*Animal animal = new Animal();
         System.out.println("年龄：" +animal.age+ "，测试！");

        Dog dog = new Dog();
        dog.age = 5;
        dog.name = "xiaotian";
        dog.eat();

        Dog dog = new Dog();
        dog.method();*/

        Dog dog = new Dog();
        dog.age = 5;
        Dog dog2 = new Dog();
        dog2.age = 5;
        if (dog.equals(dog2)) {
            System.out.println("两个对象相同！");
        } else {
            System.out.println("两个对象不相同！");
        }

    }
}
