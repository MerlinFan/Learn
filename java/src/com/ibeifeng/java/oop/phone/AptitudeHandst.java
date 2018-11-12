package com.ibeifeng.java.oop.phone;

import javax.sound.midi.Soundbank;

public class AptitudeHandst extends Handset implements PlayWiring, Network, TheakePictures{
    public AptitudeHandst(){}
    public AptitudeHandst(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带图片和文字的信息。。。");
    }

    @Override
    public void call() {
        System.out.println("开始视频通话。。。");
    }

    @Override
    public void network() {
        System.out.println("已成功启动移动网络。。。");
    }

    @Override
    public void takePictures() {
        System.out.println("咔嚓。。。拍照成功。。。");
    }

    @Override
    public void play(String music) {
        System.out.println("开始播放" + music + "。。。");
    }
}
