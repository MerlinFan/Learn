package com.ibeifeng.java.core.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap_KV {
    public static void main(String[] args) {
        Student s1 = new Student("aa", 12);
        Student s2 = new Student("bb", 10);
        Student s3 = new Student("cc", 8);

        Dog dg = new Dog();

        HashMap<String, Student> alist = new HashMap<String, Student>();

        alist.put("ll", s1);
        alist.put("zg", s2);
        alist.put("wc", s3);

        /**
         * hashMap允许value重复， 不允许key重复
         */
        alist.put("qq", s1);    // 4
//        alist.put("ll", s3);    // 3
        System.out.println(alist.size());
        System.out.println(alist.get("qq").getName());
        System.out.println("=========================");

//        Set<String> keys = alist.keySet();  // get key
//        Iterator<String> it = keys.iterator();

        Iterator<String> it = alist.keySet().iterator();    // get key
        while (it.hasNext()) {
            String key = it.next();
            Student stu = alist.get(key);
            System.out.println(stu.getName() + "\t" + stu.getAge());
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

class Dog{}
