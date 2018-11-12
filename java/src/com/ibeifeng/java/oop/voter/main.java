package com.ibeifeng.java.oop.voter;

public class main {
    public static void main(String[] args) {
        Voter zhang=new Voter("张三");
        Voter li = new Voter("李四");
        Voter wang = new Voter("王舞");

        zhang.vote();
        zhang.showResult();
        li.vote();
        li.showResult();
        wang.vote();
        wang.showResult();
        new Voter("丁丁").vot();
        for (int i = 0; i < 98; i++) {
            Voter.vote();
        }

    }
}
