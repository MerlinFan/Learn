package com.ibeifeng.java.oop.animal;

public class Cat extends Animal {
    public Cat(){};
    public Cat(String name, int leg) {
        super(name, leg);
    }

    public void setLeg(int leg) {
        if(leg > 4)
            throw new AnimalException("猫的腿不能超过4条");
        this.leg = leg;
    }

    @Override
    public String shut() {
        return "喵喵喵。。。";
    }
}
