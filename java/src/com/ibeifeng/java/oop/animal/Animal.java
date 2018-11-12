package com.ibeifeng.java.oop.animal;

public abstract class Animal {
    public String name;
    public int leg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public Animal(){}
    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public abstract String shut();

}
