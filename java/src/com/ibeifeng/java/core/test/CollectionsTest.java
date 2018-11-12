package com.ibeifeng.java.core.test;

import com.ibeifeng.java.core.dog.Dogs;
import com.ibeifeng.java.oop.penguin.Preson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1("aa", "雪纳瑞",10);
        Dog1 d2 = new Dog1("ff", "拉布拉多",4);
        Dog1 d3 = new Dog1("cc", "拉布拉多",2);
        Dog1 d4 = new Dog1("bb", "雪纳瑞",7);

        ArrayList<Dog1> dog = new ArrayList<Dog1>();
        Collections.addAll(dog, d1, d2, d3, d4);
        for (Dog1 dg : dog) {
            System.out.println(dg.getId() + "\t" + dg.getName());
        }
        System.out.println("==========================");

//        Collections.sort(dog);
//        Collections.sort(dog, new CompareByID());
        Collections.sort(dog, new CompareByName());
        for (Dog1 dg : dog) {
            System.out.println(dg.getId() + "\t" + dg.getName());
        }

/*
        ArrayList<String> strs = new ArrayList<String>();

        Collections.addAll(strs, "aa", "cc", "bb", "dd");
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("==========================");
        Collections.sort(strs);     // 从小到大排序
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("==========================");
        Collections.swap(strs, 0, 3);       // 交换元素
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("==========================");
        String s = Collections.max(strs);       // 查找最大值，最小值
        String s2 = Collections.min(strs);

        System.out.println(s + "\t" + s2);
*/



    }
}

class Dog1 implements Comparable<Dog1> {
    private String name;
    private String type;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dog1(){};

    public Dog1(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    @Override   // 重写compareTo函数
    public int compareTo(Dog1 o) {
        // 返回-1 表示降序排序，返回-1,表示倒序

//        // 按照 id 进行排序
//        if (this.id > o.id) {
//            return -1;
//        } else if (this.id == o.id) {
//            return 0;
//        } else {
//            return 1;
//        }
        // 按照 name 进行排序
        if (this.name.compareTo(o.name) > 0) {
            return -1;
        } else if (this.name.compareTo(o.name) == 0) {
            return 0;
        } else {
            return 1;
        }

    }
}

// 单独实现比较类
class CompareByID implements Comparator<Dog1>{

    @Override
    public int compare(Dog1 o1, Dog1 o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}

class CompareByName implements Comparator<Dog1> {
    @Override
    public int compare(Dog1 o1, Dog1 o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
