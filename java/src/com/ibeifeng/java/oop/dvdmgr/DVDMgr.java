package com.ibeifeng.java.oop.dvdmgr;


import java.util.Arrays;
import java.util.Scanner;

/**
 * DVD管理类
 */
public class DVDMgr {
    DVD dvds[] = new DVD[3];
    /**
     * 初始化数据
     */
    public DVDMgr() {


        dvds[0] = new DVD("罗马假日", "以借出", "2017-04-01", 30);
        dvds[1] = new DVD("风声鹤唳", "可借");
        dvds[2] = new DVD("浪漫满屋", "可借");
    }

    public void show() {
        System.out.println("名称" + "\t\t\t\t" + "次数");
        for (DVD d : dvds) {
            System.out.println(d.getName() + "\t\t\t" + d.getCount());
        }
    }

    /**
     * 新增图书
     *
     * @param dvd
     */
    public void add(DVD dvd) {
        // 获取原数组的大小
        int oldLen = dvds.length;
        // 扩展原数组的大小
        int newLen = oldLen + 1;
        // 将原数组复制到新数组
        dvds = Arrays.copyOf(dvds, newLen);
        dvds[newLen - 1] = dvd;

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        System.out.println("欢 迎 使 用 迷 你 DVD 管 理 器");
        System.out.println("--------------------------------------");
        System.out.println("0.借出排行榜");
        System.out.println("1.新 增 DVD");
        System.out.println("2.查 看 DVD");
        System.out.println("3.删 除 DVD");
        System.out.println("4.借 出 DVD");
        System.out.println("5.归 还 DVD");
        System.out.println("6.退 出 DVD 管 理 系 统");
        System.out.println("--------------------------------------");

        do {
            System.out.print("请选择：");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("----> 排行榜");
                    show();
                    break;
                case 1:
                    System.out.println("----> 新增");
                    System.out.print("请输入DVD名称：");
                    String name = scanner.next();
                    // 调用DVD方法
                    DVD dvd = new DVD();
                    dvd.setName(name);
                    add(dvd);

                    System.out.println("新增" + name + "成功！");
                    break;
                case 2:
                    System.out.println("----> 查看");
                    System.out.print("请输入需要查看的DVD名称：");
                    // 调用DVD方法

                    break;
                case 3:
                    System.out.println("----> 删除");
                    System.out.println("请输入需要删除的DVD名称");
                    //

                    break;
                case 4:
                    System.out.println("----> 借出");
                    System.out.println("请输入需要借出的DVD名称");
                    //
                    break;
                case 5:
                    System.out.println("----> 归还");
                    System.out.println("请输入需要归还的DVD名称");
                    //

                    break;
                case 6:
                    System.out.println("已退出DVD管理器");
                    break;
            }
        }while (choose != 6);
    }


}

