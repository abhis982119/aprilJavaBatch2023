package com.java.course.classData.mehtods.general;

import com.java.course.classData.mehtods.general.JavaMethods;

public class Runner {

    /*
    variables
    methods
    constructor
    instance block
    static block
     */


    static{
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public Runner() {

    }

    int instanceVariable ;
    public static void main(String[] args){

        JavaMethods javaMethods = new JavaMethods();
        javaMethods.instanceMethod();






    }



}
