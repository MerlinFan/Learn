package com.ibeifeng.java.core.dog;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set dogs = new HashSet();   // 多态写法，一个对象一个方法

        // 创建dog对象
        Dogs d1 = new Dogs("欧欧", "雪纳瑞");
        Dogs d2 = new Dogs("丫丫", "拉布拉多");
        Dogs d3 = new Dogs("飞飞", "拉布拉多");
        Dogs d4 = new Dogs("美美", "雪纳瑞");

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);

        System.out.println("狗狗的个数是：" + dogs.size());
        System.out.println("分别是：");

        Iterator it = dogs.iterator();
        while (it.hasNext()) {
            Dogs dog = (Dogs)it.next();
            System.out.println(dog.getName() + "\t\t\t" + dog.gettype());
        }

    }
}
