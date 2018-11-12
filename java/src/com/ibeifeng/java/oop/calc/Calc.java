package com.ibeifeng.java.oop.calc;

import java.util.Scanner;

public class Calc {
    public static void main(String [] ages){
        int [] a = new int[5];
        int [] s = new int[9];
        Add sum = new Add();
        System.out.println(sum.addSum(2.2, 3.3));
        System.out.println(sum.addSum(3, 5));
        System.out.println(sum.addSum(3, 5, 3.3));
        System.out.println();
        System.out.println("Calc.main");
        System.out.println("ages = [" + ages + "]");
        System.out.println("sum = " + sum);

    }
}
