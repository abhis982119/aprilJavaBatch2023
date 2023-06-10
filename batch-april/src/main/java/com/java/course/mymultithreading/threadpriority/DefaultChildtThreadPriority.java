package com.java.course.mymultithreading.threadpriority;

public class DefaultChildtThreadPriority {

    public static void main(String[] args) {

        System.out.println("Name of thread : " + Thread.currentThread().getName());
        System.out.println("Priority of thread : " + Thread.currentThread().getPriority());


        Runnable task =  () ->  {
            System.out.println("Runnable task");
        };

        Thread thread = new Thread(task);     //new
        thread.setName("runnable-thread");

        System.out.println("Name of thread : " +  thread.getName());
        System.out.println("Priority of thread : " + thread.getPriority());



    }
}
