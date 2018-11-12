package com.ibeifeng.java.core.test;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
/*
        String pwd;
        String upwd;
        String name;
        String uname;

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册XXX系统账户");
        System.out.println("请输入用户名：");
        name = scanner.next();

        do {
            System.out.println("请输入密码：");
            pwd = scanner.next();

            if (pwd.length() < 6) {
                System.out.println("密码不能小于6位数，请重新输入");
            }
        } while (pwd.length() < 6);
        System.out.println("注册成功！");
        System.out.println("请牢记用户名和密码");
        System.out.println("请登录：");

        do {
            System.out.println("请输入用户名：");
            uname = scanner.next();
//            if (!uname.equals(name)) {
            if (!uname.equalsIgnoreCase(name)) {        // 忽略用户名大小写
                System.out.println("用户名不对，请重新输入");
            }
//        } while (!uname.equals(name));
        } while (!uname.equalsIgnoreCase(name));        // 忽略用户名大小写

        do {
            System.out.println("请输入密码：");
            upwd = scanner.next();

            if (!upwd.equals(pwd)) {
                System.out.println("密码不正确，请重新输入");
            }
        } while (!upwd.equals(pwd));

        System.out.println("登录成功!!");
*/

        int count = 0;
        System.out.println("=========字符转换=========");
        String pwd = "WWW.BAIDU.COM";
        String name = " dadmin admind  ";
        System.out.println(pwd.toLowerCase());      // 把字符转成小写字符
        System.out.println(name.toUpperCase());     // 把字符转成大写字符
        System.out.println(name.concat(" //系统管理员"));    // name并未成功拼接上

        String uname = name.concat(" 注释：系统管理员"); // 字符串拼接需要定义变量
        System.out.println(uname);
        System.out.println("==========字符查找========");
        System.out.println(name.indexOf("a"));      // a 第一次出现的位置
        System.out.println(name.lastIndexOf("a"));// a 最后一次出现的位置
        System.out.println(name.substring(0));      // 提取位置索引开始的字符串
        System.out.println(name.substring(1, 6));
        System.out.println(name.charAt(6));         // 查找指定位置的字符

        // 查找制定字符出现的个数
        for (int i = 0; i < name.length(); i++) {
            Character cs = name.charAt(i);
            String s = cs.toString();
            if (" ".equals(s)) {
                count++;
            }
        }
        System.out.println("\" \" 出现的次数为" + count);

        System.out.println("==========字符处理========");
        System.out.println(name.trim());            // trim只能去掉首尾的空格

        System.out.println("==========字符拆分========");
//        String[] str = name.split(" ");
        String[] str = name.split("d");       // split拆分字符，使用空格进行拆分时，忽略了最后的空格
        System.out.println("数组长度为：" + str.length);
        for (String s : str) {
            System.out.println(s);
        }

        // 利用substring查找字符出现的个数
        int index = 0, coun = 0;
        while (index != -1) {
            index = name.indexOf("d");
            name = name.substring(index + 1);
            if (index != -1) {
                coun++;
            }
        }
        System.out.println("出现的次数是：" + coun);

        System.out.println("end");


    }
}
