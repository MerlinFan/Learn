package com.ibeifeng.java.oop.javabean;

/**
 * 标准javaBean的创建过程
 */
public class JavaBean {
    // 第一步：创建私有属性
    private String name;
    private int ID;
    private int age;
    private String address;

    // 第二步：生产getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // 第三步：创建无参构造函数和有参构造函数

    public JavaBean() {
    }

    public JavaBean(String name, int ID, int age, String address) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
