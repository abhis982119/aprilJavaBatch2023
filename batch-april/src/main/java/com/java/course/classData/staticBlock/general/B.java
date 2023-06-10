package com.java.course.classData.staticBlock.general;

public class B {

//static-block
    static {
        System.out.println("Mammal-static block");
}


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
