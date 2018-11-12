package com.ibeifeng.java.base;

import java.util.Scanner;

public class scannerTest {
	public static void main(String[] args) {
		System.out.println("Scanner test...");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		int num = sc.nextInt();
		System.out.print("输入的数字为：" + num);
		sc.close();
	}
}
