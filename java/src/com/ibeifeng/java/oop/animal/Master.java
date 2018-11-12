package com.ibeifeng.java.oop.animal;

import java.util.Scanner;

public class Master {
    Animal[] animals = new Animal[2];
    Scanner scanner = new Scanner(System.in);
    int input ;

    public Master(){
        animals[0] = new Cat("加菲猫", 4);
        animals[1] = new Duck("唐老鸭", 2);
    }

    public void show(){
        for (Animal ani : animals){
            System.out.println(ani.getName() + "\t" + ani.getLeg() + "\t\t" + ani.shut());
        }
        System.out.println("是否要继续修改数据：按0进行修改操作，其他任意数字键退出");
        input = scanner.nextInt();
    }

    public void updat(){

        System.out.println("请选择要修改的信息：1、加菲猫; 2、唐小鸭; 3、海豚");
        switch(scanner.nextInt()){
            case 1:     // 修改猫的信息
                System.out.println("请输入猫的名称");
                animals[0].setName(scanner.next());
                System.out.println("请输入猫的腿数");
                animals[0].setLeg(scanner.nextInt());
                break;
            case 2:     // 修改鸭子的信息
                System.out.println("请输入鸭的名称");
                animals[1].setName(scanner.next());
                System.out.println("请输入鸭的腿数");
                animals[1].setLeg(scanner.nextInt());
                break;
            case 3:     // 修改海豚的信息
                System.out.println("请输入海豚的名称");
                animals[2].setName(scanner.next());
                System.out.println("请输入海豚的腿数");
                animals[2].setLeg(scanner.nextInt());
                break;
            default:
                    break;
        }
    }

    public void start(){
        do{
            show();
            if (input == 0) {
                updat();
            }
        }while (input == 0);
    }
}
