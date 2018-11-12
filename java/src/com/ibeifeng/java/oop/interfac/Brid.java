package com.ibeifeng.java.oop.interfac;

public class Brid implements Fly, Tack{
    @Override
    public void fly() {
        System.out.println("鸟飞了。。。");
    }
    // 实现类，就必须实现接口的所有方法
    @Override
    public void say() {
        System.out.println("鸟叫起来了。。。");
    }

    @Override
    public void feifei() {
        System.out.println("大鹏在天上飞。。。");
    }
}
