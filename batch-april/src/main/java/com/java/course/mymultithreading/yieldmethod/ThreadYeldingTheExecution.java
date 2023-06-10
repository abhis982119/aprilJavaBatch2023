package com.java.course.mymultithreading.yieldmethod;

public class ThreadYeldingTheExecution {

    public static void main(String[] args) {

         Thread thread = new Thread(){    // new
             
             @Override
             public void run(){               //running
                 for (int i = 0 ; i < 5; i++ ){
                     System.out.println("Hi,  " + System.currentTimeMillis());
                     yield();                   // wating
                 }
             } // dead
         };

         thread.start();  // ready
    }
}
