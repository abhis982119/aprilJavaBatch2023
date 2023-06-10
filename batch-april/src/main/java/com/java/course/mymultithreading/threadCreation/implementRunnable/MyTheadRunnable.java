package com.java.course.mymultithreading.threadCreation.implementRunnable;

import com.java.course.Oops.inheritence.multipleInheritence.Animal;

public class MyTheadRunnable implements   Runnable {


    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){  //running
            System.out.println("Hello from runnable thread " );
        }
    } // dead
}
