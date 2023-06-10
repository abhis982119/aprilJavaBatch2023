package com.java.course.Oops.polymorphism.multipleForm;

public class Dog extends  Mammal{
    @Override
    public void speak() {
        wagTail();
        System.out.println("Bark bark ");
    }

    public void wagTail(){
        System.out.println("wag tail");
    }
}
