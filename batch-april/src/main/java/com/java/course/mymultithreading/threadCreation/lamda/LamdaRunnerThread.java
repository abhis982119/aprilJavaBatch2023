package com.java.course.mymultithreading.threadCreation.lamda;

public class LamdaRunnerThread {
                                               //     thread         priority
    public static void main(String[] args) {     // main-thread :      5
                                                //  task-thread :      5



        Runnable task  = () ->  {                //
           for (int i = 0 ; i < 10 ; i++){
               System.out.println("value of i : " + i);
           }
        };


        Thread thread = new Thread(task);
        thread.setName("task-thread");
        thread.start();


    }
}
