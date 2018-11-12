package com.ibeifeng.java.core.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyhashMap {
    public static void main(String[] args) {
        HashMap hmap = new HashMap();
        hmap.put("CN", "中国");
        hmap.put("JC", "日本");
        hmap.put("dog", "小黑");
        hmap.put("hello", "你好");
        hmap.put("EN", "美国");
        System.out.println("HashMap 集合大小为:" + hmap.size());

        // 循环查找key
        for (Object map : hmap.keySet()) {
            System.out.println(map);
        }
        System.out.println("=========================");
        // 循环查找value
        for (Object value : hmap.values()) {
            System.out.println(value);
        }
        System.out.println("=========================");
        // 通过循环key得到value
        System.out.println(hmap.get("CN"));
        for (Object key : hmap.keySet()) {
            System.out.println(hmap.get(key));
        }
        System.out.println("=========================");
        System.out.println(hmap);

        System.out.println("=========================");
        // 通过迭代器key--》value
        Set set = hmap.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object val = hmap.get(key);;
            System.out.println(key + ":" + val);
        }

        System.out.println(hmap.containsValue("中国"));

    }
}
