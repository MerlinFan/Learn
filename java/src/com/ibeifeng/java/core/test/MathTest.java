package com.ibeifeng.java.core.test;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.sin(0.52387));          // 30°角，输入为弧度值
        System.out.println(Math.sin(0.16667*Math.PI));

        System.out.println(Math.abs(-3));
        System.out.println(Math.max(3,23.0));
        System.out.println((int) (Math.random() * 10)); // 0-9之间的随机数
        System.out.println((int) (Math.random() * 11 + 12)); // 12-22
        System.out.println((int) (Math.random() * 9 + 55));   // 55--63


        Random ran1 = new Random();                     // random类生成随机数
        System.out.println(ran1.nextInt(4)+12);

    }
}
