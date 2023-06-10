package com.java.course.Oops.polymorphism.overriding;

public class Runner {

    public static  void  main(String[] args){



        B b = new B();
        b.m1();
        b.m2();





        A a = new B();
        a.m1();






    }

    public static void square(int val){
        System.out.println("received int sqaure : " + (val*val));
    }

    public static void square(short val){
        System.out.println("received short sqaure : " + (val*val));
    }
}
