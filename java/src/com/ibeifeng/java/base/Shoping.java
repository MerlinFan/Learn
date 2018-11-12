package com.ibeifeng.java.base;

import java.util.Scanner;

public class Shoping {
	public static void main(String[] args){
		double[] money = new double[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i+1) + "笔购物金额：");
			money[i] = scan.nextDouble();
		}

		System.out.println("序号\t\t金额（元）");
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "\t\t" + money[i]);
		}
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += money[i];
		}
		System.out.println("总金额\t\t" +  sum);
		scan.close();

	}
}

