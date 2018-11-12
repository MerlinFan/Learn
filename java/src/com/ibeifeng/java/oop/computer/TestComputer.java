package com.ibeifeng.java.oop.computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new inter();
        Ram ram = new JiSiDun();
        Hd hd = new XiShu();
        computer.show(cpu, hd, ram);
    }
}
