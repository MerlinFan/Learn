package com.ibeifeng.java.oop.animal;

public class Duck extends Animal {
    public Duck(){};

    public Duck(String name, int leg) {
        super(name, leg);
    }

    @Override
    public void setLeg(int leg) {
        if(leg > 2)
            throw new AnimalException("鸭子最多2条腿");
    }

    @Override
    public String shut() {
        return "嘎嘎嘎。。。" ;
    }
}
