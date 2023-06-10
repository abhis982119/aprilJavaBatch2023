package com.java.course.modifiers.accessModifiers.modifierProtected;

public class Runner {

    public static void main(String[] args){
          C a = new C("Naresh", "Karnataka");
        System.out.println("Animal class name : " + a.getName());
        System.out.println("Animal class address : " + a.getAddress());
        System.out.println("Animal uuid  : " + a.getUuid());
    }
}
