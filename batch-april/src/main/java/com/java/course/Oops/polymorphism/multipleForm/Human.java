package com.java.course.Oops.polymorphism.multipleForm;

import  com.java.course.Oops.polymorphism.multipleForm.Mammal;

public class Human extends Mammal {

    @Override
    public void speak(){
        System.out.println("Hello world");
    }
}
