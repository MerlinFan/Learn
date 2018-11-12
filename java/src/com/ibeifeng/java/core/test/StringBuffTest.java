package com.ibeifeng.java.core.test;

import java.util.Scanner;

public class StringBuffTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello");
        System.out.println(buffer.toString());

        buffer.append("|world");
        buffer.insert(5, "&&");

        System.out.println(buffer.toString());

        /************string 和 stringbuffer 效率比较****************/
        long start = System.currentTimeMillis();
        String str = new String();
        for (int i = 0; i < 100000; i++) {
            str = str + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：(ms)" + (end - start));

        long start1 = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str1.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("耗时：(ms)" + (end1 - start1));
        /*********************************************************/

        System.out.println("请输入一串字符串：");
        Scanner scanner = new Scanner(System.in);
        StringBuffer sstr = new StringBuffer();
        sstr.append(scanner.next());

        for (int i = sstr.toString().length() - 3; i > 0; i = i - 3) {
            sstr.insert(i, ",");
        }
        System.out.println(sstr.toString());

    }
}
