package com.java.course.Oops.polymorphism.overloading.operatorOverloading;

public class OnlyOperatorOverloading {

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        String c = "c";
        int d = 3;
        int e = 4;

        System.out.println(a+b); //9
        System.out.println(a+c); //7


        System.out.println(a+b+c); //9
        System.out.println(a+c+b); //72


        System.out.println(a+c+(b+d+e)); //1c9

    }
}
