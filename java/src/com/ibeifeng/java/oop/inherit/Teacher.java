package com.ibeifeng.java.oop.inherit;

public class Teacher extends Person {
    private int tid;

    public int getId() {
        return tid;
    }

    public void setId(int tid) {
        this.tid = tid;
    }

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, int age) {
        super(name, sex, age);
        this.tid = id;
    }

    public void teach(){
        System.out.println(getName() + "的编号为：" + tid + ",他正在教书。。。" );
    }

    public void invigilate(){
        System.out.println(getName() + "正在监考。。。");
    }

    @Override
    public void info() {
        System.out.println("编号：" + tid + "姓名：" + getName() + ",年龄：" + getAge() + "，性别：" + getSex());
    }
}
