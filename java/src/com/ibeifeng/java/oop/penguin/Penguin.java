package com.ibeifeng.java.oop.penguin;

public class Penguin extends Comm{
    public Penguin(String name, String gender, int healthValue, int loveValue) {
        super(name, gender, healthValue, loveValue); //调用父类的构造方法
    }

    public Penguin() {
    }
}
