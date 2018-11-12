package com.ibeifeng.java.base;

import java.util.Scanner;

public class PhonePrices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] phone = new int[5];
		System.out.print(phone.length);
		System.out.print("请输入已知5部手机的价格\n");
		for(int i = 0; i < phone.length; i++) {
			System.out.print("第" + i + "部手机的价格为：");
			phone[i] = scan.nextInt();
		}
		System.out.print("所有手机的价格为：");
		for(int i = 0; i < phone.length; i++) {
			System.out.print(phone[i] + " ");
		}
		for(int i = 0; i < phone.length -1; i ++) {
			for(int j = 0; j < phone.length - 1 - i; j ++) {
				if(phone[j]> phone[j+1]) {
					int temp = phone[j];
					phone[j] = phone[j+1];
					phone[j+1] = temp;
				}
			}
		}
		System.out.print("\n最便宜的手机为：" + phone[0] +",最贵的手机为：" + phone[phone.length - 1]);
		scan.close();
	}
}