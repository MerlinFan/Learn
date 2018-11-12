package com.ibeifeng.java.oop.buytickets;

public class Visitor {  //创建一个类
     public String name;
     public int age;

    // 定义方法
    public void bookTicket(){
        if(age >= 20 && age < 65){
            System.out.println(name + "的年龄是" + age + ",全票为20￥");
        }else if(age >= 12 && age < 20 ){
            System.out.println(name + "的年龄是" + age + ",半票票为10￥");
        }else{
            System.out.println(name + "的年龄是" + age + ",可免费参观");
        }
    }
}
