package com.ibeifeng.java.core.file;

import sun.applet.Main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IOtest {
    public static void main(String[] args) {
        File dirfile = new File("E:\\JavaDate\\资料\\mydir\\a\\b\\c\\d");
        File file = new File("E:\\JavaDate\\资料\\a.txt");


        try {
//            file.createNewFile();         // 创建文件
            file.delete();
            dirfile.delete();               // 只能删除空文件

            System.out.println("/********************创建文件**********************/");
            if (file.exists()) {
                System.out.println("文件存在");
            } else {
                System.out.println("文件不存在");
                file.createNewFile();
                System.out.println("创建成功");
                System.out.println("文件名为：" + file.getName());// 获取文件名称
            }
            System.out.println("文件路径:" + file.getAbsolutePath());// 获取文件的绝对路径
            System.out.println("文件路径:" + file.getPath());
            System.out.println("文件的父目录路径:" + file.getParentFile());       // 获取文件的父目录路径

            System.out.println("/***********************创建文件目录***********************/");
            if (dirfile.exists()) {
                System.out.println("目录已存在");
            } else {
                System.out.println("目录不存在");
                dirfile.mkdirs();
                System.out.println("目录创建成功");
            }

            System.out.println("/*********************重命名************************/");
            file.renameTo(new File("E:\\JavaDate\\资料\\cac.txt"));    // 文件重命名
            System.out.println("文件重命名成功，文件名为：" + file.getName());

            // 剪切文件
            file.renameTo(new File("E:\\JavaDate\\资料\\mydir\\a\\b\\c\\cac.txt"));

            // 查看文件属性
            long time = file.lastModified();
            Date date = new Date(time);
            SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm");
            String lastModify = sdf.format(date);
            System.out.println("文件属性：" + file.getPath() + "\t" + file.getName() + "\t" + file.length() + "\t" + lastModify);

            System.out.println("/*********************遍历目录和文件************************/");
            File file1 = new File("E:\\JavaDate\\资料\\mydir");
            new IOtest().show(file1);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            System.out.println(f.getName());
            if (f.isDirectory()) {
                show(f);
            }
        }

    }
}
