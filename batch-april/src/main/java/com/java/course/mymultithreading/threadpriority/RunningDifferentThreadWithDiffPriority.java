package com.java.course.mymultithreading.threadpriority;

public class RunningDifferentThreadWithDiffPriority {


    public static void main(String[] args)  throws  Exception{
        Runnable task1 = () -> {
            for( int i = 0 ; i < 5 ; i++ ) {   // Running
                try {
                    Thread.sleep(2000);   // block
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("English task");
            }
        };

        Runnable task2 = () -> {
            for( int i = 0 ; i < 5 ; i++ ) {   // state : Running
                try {
                    Thread.sleep(2000);   // state : block
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Maths task");
            }  // state : dead
        };


        Thread englishThread = new Thread(task1); // state: new , priority: 5
        englishThread.setPriority(Thread.MIN_PRIORITY); // state: new , priority: 1

        Thread mathsThread = new Thread(task2);  // state: new , priority: 5
        mathsThread.setPriority(Thread.MAX_PRIORITY);// state: new , priority: 10


        long startTime = System.currentTimeMillis();
        mathsThread.start();   //state: ready
        englishThread.start(); // state : ready
        long endTime = System.currentTimeMillis();




        // core : 1 2 3 4 5 6

    }



}
