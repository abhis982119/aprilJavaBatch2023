package com.java.course.modifiers.accessModifiers.modifierDefault;


import com.java.course.modifiers.accessModifiers.accessModifierModel.Candidate;
import com.java.course.modifiers.accessModifiers.modifierProtected.A;

class Runner {

    public static  void main(String[] args){
    /*    DefaultCandidate candidate = new DefaultCandidate("Naresh", "MK", 15000);

        System.out.println("first-name : " + candidate.getFirstName());
        System.out.println("last-name  : " + candidate.getLastName());
        System.out.println("salary : " + candidate.getSalary());

        System.out.println("-----------------------------------------------------");

        System.out.println("first-name : " + candidate.firstName);
        System.out.println("last-name  : " + candidate.lastName);
        System.out.println("salary : " + candidate.salary);*/


       /**/

        B b = new B("Abhishek", "Harayana");
        System.out.println("Animal class name : " + b.getName());
        System.out.println("Animal class address : " + b.getAddress());

    }
}
