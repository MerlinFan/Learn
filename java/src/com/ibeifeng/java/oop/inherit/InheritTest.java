package com.ibeifeng.java.oop.inherit;

import com.ibeifeng.java.oop.penguin.Preson;

public class InheritTest {
    public static void main(String[] args) {

        Student cli = new Student(2014, "li", "女", 14);
        Student clili = new Student(2014, "li", "女", 14);
        System.out.println(cli.equals(clili));


        System.out.println("\n******************************多态实现***************************\n");

        Person li = new Student(201808, "li", "女", 22);
        li.info();
        li.toDo();
        Student lili = (Student)li;             // 向下转型
        if (lili instanceof Person) {
            lili.setId(200001);
        } else {
            System.out.println("类型不匹配");
        }


        Student stu = new Student(201202, "wang", "男", 21);
        stu.info();                             // 向上转型，自动转

        stu.changeID(li);
        li.info();


    }
}

