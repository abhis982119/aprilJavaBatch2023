package com.java.course.classData.mehtods.general;

public class InnerMethodRunner {

    public  static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        outerClass.m1();;


        InnerMethodNotAllowedClass innerMethodNotAllowedClass = new InnerMethodNotAllowedClass();
        innerMethodNotAllowedClass.m1();

    }
}
