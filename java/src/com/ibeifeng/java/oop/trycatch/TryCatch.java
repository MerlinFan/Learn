package com.ibeifeng.java.oop.trycatch;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.security.PublicKey;

public class TryCatch {
    public static void main(String[] args)  {
        new TryCatch().div(10, 0);
    }
    public void div(int a, int b){
        int sum = 0;
        try {
            sum = a / b;
        }
        catch (UserException ex){
            ex.printStackTrace();
        }
//        catch (Exception ex){
//            throw new UserException("被除数不能为0");
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        System.out.println(a + "/" + b + "=" + sum);
    }
}
