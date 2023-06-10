package com.java.course.mymultithreading.threadname;

public class MyTheadName {

    public static void main(String[] args){
            Thread thread = Thread.currentThread();
            System.out.println("Main thread : " + thread);

            thread.setName("Naresh-main-thread");
            System.out.println("Main thread : " + thread);


            thread.setPriority(7);
            System.out.println("Main thread : " + thread);
    }
}
