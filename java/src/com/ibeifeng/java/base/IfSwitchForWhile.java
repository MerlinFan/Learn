package com.ibeifeng.java.base;

import java.util.Scanner;

public class IfSwitchForWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入学号：");
		int id = scan.nextInt();
		if(id != 0)	{
			System.out.print("请输入名次：");
			String level = scan.next();
			switch(level) {
				case "第一名":
					System.out.println("奖励惠普笔记本一台");
					break;
				case "第二名":
					System.out.println("奖励移动硬盘一个");
					break;
				case "第三名":
					System.out.println("奖励保温水杯一个");
					break;
				default:
					System.out.println("无任何奖励");
					break;
			}
		}

		/**
		 * 打印*三角
		 */
		for(int i = 0; i < 5; i ++) {
			// 打印左边空白
			for(int j = 0; j < 4 - i; j ++) {
				System.out.print(" ");
			}
			// 打印中间*号
			for(int k = 0; k < i * 2 + 1; k ++)	{
				System.out.print("*");
			}
			System.out.println();
		}

		/**
		 * 判断100-1000之间的水仙花数的个数
		 */
		int a = 0, b = 0, c = 0;
		for(int i = 100; i < 1000; i ++) {
			a = i / 100;
			b = i % 100 /10;
			c = i % 10;
			if((a*a*a + b*b*b + c*c*c) == i)
				System.out.println(i + " 是水仙花数");
		}

		/**
		 * 九九乘法表
		 */
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < i + 1; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "  ");
			}
			System.out.println();
		}

		scan.close();

	}
}