package com.ibeifeng.java.core.test;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("ss");
        list.add(22);
        list.add("aa");
        list.add(33);
        System.out.println("=========================第一个for循环=========================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.addFirst(11);
        list.addLast("dd");
        System.out.println("=========================第二个for循环=========================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=========================第三个for循环=========================");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();

        list.removeFirst();
        list.removeLast();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
