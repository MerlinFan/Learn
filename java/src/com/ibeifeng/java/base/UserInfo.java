package com.ibeifeng.java.base;

import java.util.Scanner;

public class UserInfo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("请注册");
		System.out.print("请输入用户名:");
		String Id = scanner.next();
		System.out.print("请输入密码:");
		String Pwd = scanner.next();

		for(int i = 3; i >=0; i--) {
			System.out.print("请输入用户名:");
			String userId = scanner.next();
			System.out.print("请输入用户密码:");
			String userPwd = scanner.next();

			if(userId.equals(Id) && userPwd.equals(Pwd)) {
				System.out.println("欢迎登陆MyShopping系统");
				break;
			}else {
				System.out.println("用户名或密码错误，你还有" + i +"次机会!!!");
			}
			if(i == 0) {
				System.out.println("对不起，您3次均输出错误...");
				return ;
			}
		}
		scanner.close();
	}
}
