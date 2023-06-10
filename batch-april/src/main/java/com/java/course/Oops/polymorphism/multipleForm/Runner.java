package com.java.course.Oops.polymorphism.multipleForm;

public class Runner {

    public static void main(String[] args){

        makeSpeak(new Dog());
        makeSpeak(new Cat());
        makeSpeak(new Human());

    }


    public static void makeSpeak(Animal animal){
        animal.speak();

    }


}
