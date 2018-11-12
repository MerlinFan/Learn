package com.ibeifeng.java.core.javaenum;

import java.*;
import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Stud stud = new Stud();
        stud.setGenders(Genders.U1);
        System.out.println(stud.getGenders());
        Genders genders = Genders.U1;
        switch (genders) {
            case U1:
                System.out.println("第一单元打基础");
                break;
            case U2:
                System.out.println("第二单元可以胜任java程序开发");
                break;
            case U3:
                System.out.println("第三单元可以胜任企业级java开发");
                break;
        }
    }
}
