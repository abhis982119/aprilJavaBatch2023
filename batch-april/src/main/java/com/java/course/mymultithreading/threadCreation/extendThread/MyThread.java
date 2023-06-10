package com.java.course.mymultithreading.threadCreation.extendThread;

public class MyThread extends  Thread {

    @Override
    public void run() {
        try {                         //Running

        Thread.sleep(5000);      // Blocked
        for(int i = 0 ; i < 5; i++){   //Running

                Thread.sleep(1000);   //Blocked

            System.out.println("Hi from thread " + currentThread().getName()); //Running
        }
        }catch (Exception e){
        }
    }  //Dead
}
