package com.java.course.exceptionalHandling.trycatchblock;

public class CatchBlockWithTryCatch {

    public static void main(String[] args) {
        System.out.println("program started");
        int[] arr = new int[5];

        try {
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");

            System.out.println(arr[9]);


            System.out.println("e");
            System.out.println("f");
            System.out.println("g");
            System.out.println("h");
        }  catch (ArrayIndexOutOfBoundsException e ){

            System.out.println("Error msg : " + e.getMessage()); // 9

            try {
                int a = 10 / 0;
            }catch (ArithmeticException ex){
                System.out.println("Error msg " + ex.getMessage());
            }

        }

        System.out.println("program ended");
    }
}
