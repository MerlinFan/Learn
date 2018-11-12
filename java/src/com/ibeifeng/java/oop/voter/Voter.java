package com.ibeifeng.java.oop.voter;

public class Voter {
    private static int count;
    private static final int total = 100;
    private String name;

    // 投票
    public  void vot(){
        System.out.println("helloworld");

    }
    /**
     * 构造方法：
     * 方法名和类名一致，且没有返回类型（注：返回类型不是void）
     * 如果不写构造方法，系统则会默认一个无参构造方法，，如果写了，则会代替默认的构造方法
     */
    public Voter(String name){
        this.name = name;
    }
    public static void vote(){
        if(count >= total)
            System.out.println("投票结束");
        else{
            count++;
        }
    }

    public void showResult(){
        System.out.println("当前已投票" + count + "张，感谢" + name + "的支持");

    }


}
