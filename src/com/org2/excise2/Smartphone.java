package com.org2.excise2;

/**
 * Created by yiyp on 2016/10/27 0027.
 */
public class Smartphone extends Telephone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("通过语音来打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语言来发短信");
    }


    @Override
    public void playGame() {
        System.out.println("具有玩游戏的功能");
    }
}
