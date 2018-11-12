package com.ibeifeng.java.oop.computer;

public class Computer {
    public void show(Cpu cpu, Hd hd, Ram ram){
        System.out.println("计算机的信息如下：");
        System.out.println("CPU的品牌是：" + cpu.getBoard() + "，主频是：" + cpu.getHz() + "GHz");
        System.out.println("硬盘容量是：" + hd.getHdCapacty() + "GB");
        System.out.println("内存容量是：" + ram.getRamCapacty() + "GB");
    }
}
