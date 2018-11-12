package com.ibeifeng.java.oop.inherit;

import com.sun.org.apache.bcel.internal.generic.IFNE;

public class Student extends Person{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, int age) {
        super(name, sex, age);
        this.id = id;
    }

    public void readBook(){
        System.out.println(getName() + "的学号为：" + id + ",他正在看书。。。" );
    }
    public void test(){
        System.out.println(getName() + "正在考试");
    }

    @Override
    public void info() {
        System.out.println("学号：" + id + ",姓名：" + getName() + ",年龄：" + getAge() + "，性别：" + getSex());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stu = (Student) obj;
            if (stu.id == this.id && stu.getName().equals(getName()))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
    public void changeID(Person per){
        Student student = (Student) per;
        ((Student) per).setId(2222222);
    }
}
