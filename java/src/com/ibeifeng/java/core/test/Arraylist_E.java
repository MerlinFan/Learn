package com.ibeifeng.java.core.test;

import com.ibeifeng.java.oop.penguin.Dog;

import java.util.ArrayList;

public class Arraylist_E {
    public static void main(String[] args) {
        ArrayList<Dogs> dogs = new ArrayList<Dogs>();
        Dogs d1 = new Dogs("YY", 12);
        Dogs d2 = new Dogs("ZZ", 10);
        Dogs d3 = new Dogs("AA", 8);

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        System.out.println("一共有" + dogs.size() + "只狗");
        System.out.println("分别是：");
        for (Dogs dog : dogs) {
            System.out.println(dog.getName() + "\t" + dog.getAge());
        }
        dogs.remove(0);
        System.out.println("==========================");
        System.out.println("一共有" + dogs.size() + "只狗");
        System.out.println("分别是:");
        for (Dogs dog : dogs) {
            System.out.println(dog.getName() + "\t" + dog.getAge());
        }
        System.out.println("==========================");



    }


}

class Dogs {
    private String name;
    private int age;

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dogs(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
