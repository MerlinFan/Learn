package com.ibeifeng.java.core.test;

import javax.security.auth.kerberos.KerberosKey;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list = new ArrayList();

        // list1列表元素
        list1.add("gg");
        list1.add(44);
        // list列表元素
        list.add("ss");
        list.add(33);
        list.add(3);
        list.add("zhanshanfeng");
        list.add(1, 66);

        System.out.println("=========================第一个for循环=========================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=========================第二个for循环=========================");
        list.addAll(0,list1);   // 将list1所有的元素复制到list中的第0个位置
        list.remove(3);         // 删除第三个元素
        list.remove((Object) 3);      // 删除元素：3
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(2));        // 输出第二个元素
        System.out.println(list.indexOf(44));   // 返回 “44“是第几个元素
        list.set(0, "kk");                      // 将第0个元素换成“kk”

        System.out.println("=========================第三个for循环=========================");
        list1 = (ArrayList) list.clone();       // 将list 克隆岛list1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("=========================第四个for循环=========================");
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list1.get(i));
        }


    }


}
