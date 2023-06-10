package com.java.course.mymultithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutors {


    public static void main(String[] args) {
        ExecutorService executorService =  Executors.newFixedThreadPool(2);


        Runnable task = () ->{

            System.out.println("task start-1");
            waitForSeconds(10);
            System.out.println("task end-1");
        };

        Runnable task2 = () ->{
            System.out.println("task start-2");
            waitForSeconds(10);
            System.out.println("task end-2");
        };

        Runnable task3 = () ->{
            System.out.println("task start-3");
            waitForSeconds(10);
            System.out.println("task end-3");
        };

        executorService.submit(task);
        executorService.submit(task2);
        executorService.submit(task3);

    }

    public static void waitForSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
