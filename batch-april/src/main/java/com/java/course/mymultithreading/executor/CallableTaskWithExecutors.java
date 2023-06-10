package com.java.course.mymultithreading.executor;

import java.util.concurrent.*;

public class CallableTaskWithExecutors {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

       ExecutorService executorService =  Executors.newFixedThreadPool(3);

        Callable<Integer> getMangoTask = () -> {
            System.out.println("going to market ");
            waitforseconds(2);
            System.out.println("bought mango");
            waitforseconds(2);
            System.out.println("reached home");
            return 100;

        };


        Callable<Integer> getJuicerTask = () -> {
            System.out.println("going to chrome store ");
            waitforseconds(5);
            System.out.println("bought juicer");
            waitforseconds(5);
            System.out.println("reached home");
            return 15000;

        };


        Callable<Integer> getGlassTask = () -> {
            System.out.println("going to departmental store ");
            waitforseconds(5);
            System.out.println("bought juice glasses");
            waitforseconds(5);
            System.out.println("reached home");
            return 1000;

        };


       Future<Integer>  mangoCost = executorService.submit(getMangoTask);
       Future<Integer>  juicerCost = executorService.submit(getJuicerTask);
       Future<Integer>  glassCost = executorService.submit(getGlassTask);


        makeJuiceAndServiceWithTotalCost(mangoCost.get(), juicerCost.get(), glassCost.get() );

        executorService.shutdown();



    }

    public static  void makeJuiceAndServiceWithTotalCost(int mangoCost, int juicerCost, int glassCost){
        System.out.println("total cost to service mango juice is :  " + (mangoCost + juicerCost + glassCost));
    }

    public static void waitforseconds(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
