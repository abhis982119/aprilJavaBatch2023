package com.java.course.keywords.superKeyword;

public class A {

    public A(){

    }

    public float makeSalary(B b){
        System.out.println("starting Animal-m1()");
        return getPostTaxSalary(b.getSalary());


    }

    private float getPostTaxSalary(int salary){
        return salary * 0.7f;
    }
}
