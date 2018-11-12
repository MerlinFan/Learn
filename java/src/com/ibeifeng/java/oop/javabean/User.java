package com.ibeifeng.java.oop.javabean;

import com.ibeifeng.java.oop.buytickets.Visitor;     // 导入buyticket包中的Visitor类

public class User {
    public static void main(String [] args){
        Visitor user = new Visitor();
        user.name = "李四";
        user.age = 22;
        user.bookTicket();
        // 当前包与导入包如果有重名，name都要使用全路径，
        // 如果不使用全路径，那么默认的是导入的类；
//        Visitor user1 = new Visitor();
        com.ibeifeng.java.oop.javabean.Visitor user1 = new com.ibeifeng.java.oop.javabean.Visitor();
        user1.name = "张三";
        user1.age = 55;
        user1.bookTicket();
    }
}
