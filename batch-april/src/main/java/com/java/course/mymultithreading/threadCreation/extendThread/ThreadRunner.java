package com.java.course.mymultithreading.threadCreation.extendThread;

public class ThreadRunner {

    public static void main(String[] args){

        MyThread naresh = new MyThread(); // new
        naresh.setName("Naresh-Thread");
        naresh.start();                   //ready



        MyThread ashish = new MyThread();
        ashish.setName("Ashish-Thread");
        ashish.start();



    }

    /*
          =========                      =========
           main-thread                    naresh-thread
           ========                      ==========

           Sysout(a)                          Sysout(a)







     */
}
