package com.ibeifeng.java.base;

public class finalTest {
	public static void main(String[] args) {
		final int NUM = 10;

		/**
		 * final修饰一个常量，一旦定义就不能被改变；
		 * final定义的变量一般使用大写
		 */
//		NUM = 12;	// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		System.out.println(NUM);
		System.out.println();

	}
}
