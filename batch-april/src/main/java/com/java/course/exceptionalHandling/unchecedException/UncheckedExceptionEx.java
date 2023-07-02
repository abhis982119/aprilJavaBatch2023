package com.java.course.exceptionalHandling.unchecedException;

public class UncheckedExceptionEx {

    int a ;

    int b ;

    // int a = 10; // 4 byte

   //    4  8 12 16  20  24  28
    // [ 1  2  3  4  5   x   x   ]
    public static void main(String[] args) {


        int[] arr = new int[5]; // [ 20 ]   // heap
        int a = 5; // stack

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;


        print(arr);

        System.out.println("print 3rd value : " + arr[2]);


        System.out.println("print 3rd value : " + arr[5]);

        try {
            System.out.println("print 3rd value : " + arr[5]);
        }catch (Exception e){
            System.out.println("Please give correct index value");
        }

    }

    public static void print(int[] arr){
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
