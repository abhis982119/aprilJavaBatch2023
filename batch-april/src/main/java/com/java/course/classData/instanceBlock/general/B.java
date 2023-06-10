package com.java.course.classData.instanceBlock.general;

public class B extends  A{




//instance-block

    {
        System.out.println("Mammal-instance block");
    }



    //constructor
    public B() {
        System.out.println("Mammal-constructor");
    }


// variables

    int a ;


    //methods
    public void m1(){
        System.out.println("Mammal-m1");
    }
}
