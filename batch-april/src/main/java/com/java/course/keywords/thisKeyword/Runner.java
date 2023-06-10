package com.java.course.keywords.thisKeyword;

public class Runner {

    public static void main(String[] args){

        ThisKeyWord obj1 = new ThisKeyWord("Naresh");

        ThisKeyWord obj2 = new ThisKeyWord("Abhishek");

        System.out.println(obj1.getName() + " " +  obj1.getSalaryOfEmployeeIn("Dollar") );
        System.out.println(obj2.getName() + " " + obj1.getSalaryOfEmployeeIn("Rupee"));





    }
}
