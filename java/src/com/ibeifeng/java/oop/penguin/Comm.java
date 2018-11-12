package com.ibeifeng.java.oop.penguin;

public class Comm {
    //所有子类共有属性
    private String name;
    private String gender;
    private int healthValue;
    private int loveValue;

    public Comm() {    }
    // 生成方法
    public Comm(String name, String gender, int healthValue, int loveValue) {
        this.name = name;
        this.gender = gender;
        this.healthValue = healthValue;
        this.loveValue = loveValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        if (healthValue > 100 || healthValue < 0)
            healthValue = 60;
        this.healthValue = healthValue;
    }

    public int getLoveValue() {
        return loveValue;
    }

    public void setLoveValue(int loveValue) {
        if (loveValue > 100 || loveValue < 0)
            loveValue = 60;
        this.loveValue = loveValue;
    }

    public void show(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫：" + name + "，我的性别是：" + gender + ",健康值为" + healthValue + ",和主人亲密度为" + loveValue);
    }
    public void ss(){
        System.out.println("hah");
    }
}



