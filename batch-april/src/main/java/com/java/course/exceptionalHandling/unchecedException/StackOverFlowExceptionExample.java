package com.java.course.exceptionalHandling.unchecedException;

public class StackOverFlowExceptionExample {


    public static void main(String[] args) {
        System.out.println("main method started");

          m1(1);
        System.out.println("main method ended");
    }

    /*

    handle : 1000 request call / sec

    1 api : 10kb               // total memory : 100kb
    api computation : 1 sec


    t sec :-
    call     memory-left    total-memory
    0           100kb          100kb
    1            90kb
    2            80kb
    3            70

    10           0

    11          - error -


     */
// insert  8
    //                 t5
 //      t1 t2  t3  t4
    // [ 1  2   3   4   ]
    public static void m1(int callCount){
        System.out.println("m1 method called : " + callCount );
        try {
            m1(callCount + 1);
        }catch (Throwable e){
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Stack overflow exception");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }
        System.out.println("m1 method ended " + callCount);
    }
}
