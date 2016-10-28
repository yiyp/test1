package com.org2.excise2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class InitialTelephone {
    public static void main(String[] args) {
        Telephone tel = new Cellphone();
        tel.call();
        tel.message();

        Telephone tel2 = new Smartphone();
        tel2.call();
        tel2.message();

        IPlayGame ipg = new Smartphone();
        IPlayGame ipg2 = new Psp();
        ipg.playGame();
        ipg2.playGame();

        IPlayGame ipg3 = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方法实现接口");
            }
        };
        ipg3.playGame();

        new IPlayGame() {
            public void playGame() {
                System.out.println("使用匿名内部类的方法实现接口2");
            }
        }.playGame();
    }
}
