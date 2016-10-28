package com.org2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */

public class Dog extends Animal {
    public int age = 20;
    public void eat() {
        System.out.println("年龄：" +age+ "，狗具有吃骨头的能力！");
    }

    /*public Dog() {
        // super();
        System.out.println("Dog类构造方法开始执行了。");
    }*/

    public void method() {
        // System.out.println(super.age);
        // System.out.println(age);
        // super.eat();
        eat();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age;

    }
}
