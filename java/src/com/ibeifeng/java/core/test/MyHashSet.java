package com.ibeifeng.java.core.test;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet hset = new HashSet();
        hset.add("星期一");
        hset.add("星期二");
        hset.add("星期三");
        hset.add(null);
        hset.add(null);     // hashset中的数不会重复，
        System.out.println(hset.size());
        // 遍历
        for (Object h : hset) {
            System.out.println(h);
        }

        System.out.println("##########################################");

        // 迭代
        Iterator iterator = hset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*for (Object h : hset) {
            System.out.println(iterator.hasNext());
        }*/

    }
}
