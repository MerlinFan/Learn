package com.ibeifeng.java.oop.interfac;

public class TestFly {
    public static void main(String[] args) {
        Fly ap = new Brid();
        ap.fly();
        ((Brid) ap).feifei();   // 向下转型，调用子类的函数

    }
}
