package com.org2;

/**
 * Created by yyp on 2016/10/27 0027.
 */
public class Telphone {
    private float screen;
    private float cpu;
    private float mem;

    public void sendMessage() {
        System.out.println("sendMessage");
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
        this.sendMessage();
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }


    public Telphone() {
        System.out.print("无参构造方法执行" + "了！");
    }

    public Telphone(float newScreen, float newCpu, float newMem) {
        screen = newScreen;
        cpu = newCpu;
        mem = newMem;
    }
}
