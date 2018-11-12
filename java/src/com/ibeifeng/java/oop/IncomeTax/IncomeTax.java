package com.ibeifeng.java.oop.IncomeTax;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee one = new Employee();
        System.out.println("请输入员工的姓名：");
        one.setName(scanner.next());
        System.out.println("请输入员工工资：");
        one.setSalary(scanner.nextInt());
        System.out.println("请输入员工加班补贴：");
        one.setSubsidy(scanner.nextInt());

        System.out.println("员工" + one.getName() + "的税前收入为" + one.taxBefore() + "元,税后收入为" + one.taxAfter() + "元，您缴纳的个人所得税为" + one.taxIncome());

    }











}
