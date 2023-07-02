package com.java.course.exceptionalHandling.trycatchblock;

public class TryBlockWithTryCatch {

    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = new int[5];

        try{


            try{
                int value = arr[9];

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error msg : " + e.getMessage());
                e.getStackTrace();
                throw e;
            }

            int a = 10/0;

        }catch (ArithmeticException e){
            System.out.println("Error msg : " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}
