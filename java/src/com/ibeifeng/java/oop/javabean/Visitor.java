package com.ibeifeng.java.oop.javabean;

public class Visitor {  //创建一个类
     String name;
     int age;

    // 定义方法
    public void bookTicket(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
