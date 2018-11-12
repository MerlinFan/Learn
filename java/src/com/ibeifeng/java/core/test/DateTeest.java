package com.ibeifeng.java.core.test;

import com.ibeifeng.java.oop.printer.Printer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTeest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);       // 输出系统时间

        System.out.println("/****************************************************/");
        //格式化当前日期
//        SimpleDateFormat sdate = new SimpleDateFormat("y年M月d日,H时m分s秒");
        SimpleDateFormat sdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdate.format(date);
        System.out.println(str);

        System.out.println("/****************************************************/");
        //将字符串(日期格式)转成日期
        String ss = "2018-10-07 14:29:10";
        Date d = null;
        try {
            d = sdate.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);

        System.out.println("/****************************************************/");
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("今天是" + c.get(Calendar.YEAR) + "年" +
                (c.get(Calendar.MONTH) + 1) + "月" +
                c.get(Calendar.DATE) + "日" +
                c.get(Calendar.HOUR) + "时" +
                c.get(Calendar.MINUTE) + "分" +
                c.get(Calendar.SECOND) + "秒,今天是星期" +
                (c.get(Calendar.DAY_OF_WEEK) - 1) + ",今天是一个月中的第" +
                c.get(Calendar.DAY_OF_MONTH) + "天，一年中的第" +
                c.get(Calendar.DAY_OF_YEAR) + "天");

        System.out.println("/****************************************************/");
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR, 2015);
        c1.set(Calendar.MONTH, 4);
        c1.set(Calendar.DATE, 6);
        System.out.println("2015年4月6日是一年中第" + c.get(Calendar.WEEK_OF_YEAR) + "星期");
        System.out.println("2015年4月6日是星期" + (c.get(Calendar.DAY_OF_WEEK)-1));


        System.out.println("/****************************************************/");



    }
}
