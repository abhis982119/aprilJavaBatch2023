package com.java.course.exceptionalHandling.trycatchblock;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class TryCatch {

    public static void main(String[] args) {

        int[] arr = new int[5];



        try{
            System.out.println(" line 1");
            System.out.println(" line 2");

            System.out.println(divide(12, 4));
            System.out.println(divide(10,0));

            System.out.println(" line 3");
            System.out.println(" line 4");
        }catch (ArithmeticException ex){

            System.out.println("original message : " + ex.getMessage());
            throw   new ArithmeticException(" second arithmetic exception  ");
        }
    }

    public static int divide(int a , int b ){

       throw new  ArithmeticException("first arithmetic exception");
    }
}
