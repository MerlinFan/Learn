package com.ibeifeng.java.oop.penguin;

public class Dog extends Comm {
    // 子类特有属性
    private int age;
    private String bieMing;

    public String getBieMing() {
        return bieMing;
    }

    public void setBieMing(String bieMing) {
        this.bieMing = bieMing;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 构造方法：继承父类
//    public Dog(String name, String gender, int healthValue, int loveValue) {
//        super(name, gender, healthValue, loveValue);
//    }

    public Dog(String name, String gender, int healthValue, int loveValue, String bieMing) {
        super(name, gender, healthValue, loveValue);    // 访问父类的构造方法
        this.bieMing = bieMing;
    }

    // 重写父类方法
    public void show(){
        System.out.println("宠物的自白：");
        System.out.println("我叫：" + getName() + "，我的性别是：" + getGender() + ",现在" + age + "岁" + "，他们都叫我" + bieMing  + ",健康值为" + getHealthValue() + ",和主人亲密度为" + getLoveValue());
    }
}
