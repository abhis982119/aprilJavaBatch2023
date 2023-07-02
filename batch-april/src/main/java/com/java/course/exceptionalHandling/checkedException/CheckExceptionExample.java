package com.java.course.exceptionalHandling.checkedException;

public class CheckExceptionExample {

    public static void main(String[] args) {

        System.out.println("Program started");
        try {
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println("Someone woke the person");
        }
        System.out.println("Program ended");
    }
}
