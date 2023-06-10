package com.java.course.classData.staticBlock.general;

public class A {

//static-block

    static{
        System.out.println("Animal-static block");
    }


 //instance-block

    {
        System.out.println("Animal-instance block");
    }



//constructor
    public A() {
        System.out.println("Animal-constructor");
    }


// variables

    int a ;


    //methods
    public void m1(){
        System.out.println("Animal-m1 with value : " + a);
    }
}

