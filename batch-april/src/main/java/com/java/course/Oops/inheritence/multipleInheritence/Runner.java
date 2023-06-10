package com.java.course.Oops.inheritence.multipleInheritence;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

public class Runner {

    public static void main(String[] args){
        Dog dog = new Dog();

        Animal animal = new Dog();

        System.out.println("Is animal a dog : " +  ( animal instanceof  Mammal) );



    }

}
