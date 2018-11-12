package com.ibeifeng.java.core.stuhashmap;

import java.util.HashMap;
import java.util.Map;

public class TestStu {
    public static void main(String[] args) {
        Map stu = new HashMap();

        Student stu1 = new Student("xiaoming", 33);
        Student stu2 = new Student("zhangqian", 22);

        stu.put("xm", stu1);
        stu.put("zq", stu2);

        // 一般传的是对象，而不是一个指定的值
        Student stus = (Student) stu.get("xm");

        System.out.println("xm-->姓名：" + stus.getName() + "\t年龄：" + stus.getAge());
    }
}
