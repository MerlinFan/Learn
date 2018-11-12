package com.ibeifeng.java.oop.inherit;

public class Person {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){}

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void info(){
        System.out.println("姓名：" + name + ",年龄：" + age + "，性别：" + sex);
    }
    public void toDo(){
        System.out.println("现在做在教室里。。。");
    }
}
