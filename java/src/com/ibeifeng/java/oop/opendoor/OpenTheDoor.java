package com.ibeifeng.java.oop.opendoor;

// OpenTheDoor 继承 Door 类，并实现look，Doorring方法
public class OpenTheDoor extends Door implements Look, DoorRing {

    @Override
    public void openDoor() {
        System.out.println("轻轻推，门开了");
    }

    @Override
    public void closeDoor() {
        System.out.println("轻轻拉，门关了");
    }

    @Override
    public void takePhone() {
        System.out.println("以拍照");
    }

    @Override
    public void openLook() {
        System.out.println("钥匙已插入");
    }

    @Override
    public void closeLook() {
        System.out.println("钥匙已拔出");
    }
}
