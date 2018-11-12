package com.ibeifeng.java.base;

import java.util.Scanner;

public class IdAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID 卡号求和");
		System.out.print("请输入6位卡号:");
		int id = scan.nextInt();
		System.out.println(id/100000 + id%100000/10000 + id%10000/1000 + id%1000/100 + id%100/10 + id%10);
		scan.close();
	}
}