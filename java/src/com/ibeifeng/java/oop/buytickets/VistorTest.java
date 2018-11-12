package com.ibeifeng.java.oop.buytickets;

import java.util.Scanner;

public class VistorTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String visName = "";
        int visAge = 0;
        do{
            System.out.print("请输入姓名:");
            visName = scanner.next();
            System.out.print("请输入年龄:");
            visAge = scanner.nextInt();

            Visitor v = new Visitor();
            v.age = visAge;
            v.name = visName;
            v.bookTicket();
        } while(!"n".equals(visName));
        scanner.close();
    }
}
