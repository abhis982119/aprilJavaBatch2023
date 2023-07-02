package com.java.course.exceptionalHandling.trycatchblock;

public class TryBlockWithMultipleCatch {

    public static void main(String[] args) {
        System.out.println("program started");


        try {
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");

           int a = 10/0;


            System.out.println("e");
            System.out.println("f");
            System.out.println("g");
            System.out.println("h");
        } catch (NullPointerException e){
            System.out.println("Error msg : " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Error msg : " + e.getMessage()); // 9
        }catch (ArithmeticException e){
            System.out.println("Error msg " + e.getMessage());
        }

        System.out.println("program ended");
    }





}
