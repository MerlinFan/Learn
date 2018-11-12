package com.ibeifeng.java.base;

import java.util.Scanner;

public class JiFenUpdata {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] aJiFenOld = new int[5];
		int[] aJifenNew = new int[5];
		System.out.println("请输入5位会员的积分");
		while(true) {
			System.arraycopy(aJifenNew, 0, aJiFenOld, 0, aJifenNew.length);

			System.out.print("第" + (0 + 1) + "位会员的积分：");
			aJifenNew[0] = scan.nextInt();
			System.out.print("第" + (1 + 1) + "位会员的积分：");
			aJifenNew[1] = scan.nextInt();
			System.out.print("第" + (2 + 1) + "位会员的积分：");
			aJifenNew[2] = scan.nextInt();
			System.out.print("第" + (3 + 1) + "位会员的积分：");
			aJifenNew[3] = scan.nextInt();
			System.out.print("第" + (4 + 1) + "位会员的积分：");
			aJifenNew[4] = scan.nextInt();

			System.out.println("序号\t\t历史积分\t\t新年积分");
			for(int i = 0; i < 5; i++) {
				System.out.println((i+1) + "\t\t" + aJiFenOld[i] + "\t\t" + aJifenNew[i]);
			}
		}
	}
}