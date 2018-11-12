package com.ibeifeng.java.oop.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Handset phoneAI = new AptitudeHandst("小米", "Mix2s");
        Handset phoneCom = new CommonHandset("HTC", "9110");

        phoneCom.info();
        ((CommonHandset) phoneCom).play("《热血》");
        phoneCom.sendInfo();
        phoneCom.call();

        phoneAI.info();
        ((AptitudeHandst) phoneAI).network();
        ((AptitudeHandst) phoneAI).play("《小时代》 ");
        ((AptitudeHandst) phoneAI).takePictures();
        phoneAI.call();
    }
}
