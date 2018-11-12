package com.ibeifeng.java.oop.phone;

public class CommonHandset extends Handset implements PlayWiring{
    public CommonHandset(){}
    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送文字信息。。。");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话。。");
    }

    @Override
    public void play(String music) {
        System.out.println("开始播放音乐 《热血》 。。。");
    }
}
