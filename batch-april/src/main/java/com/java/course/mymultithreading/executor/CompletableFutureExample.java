package com.java.course.mymultithreading.executor;

import com.java.course.modifiers.accessModifiers.modifierPrivate.Runn;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<Integer> getMangoPrice = () -> {

            System.out.println("Task-1 going on ....");
            waitForSeconds(10);
            System.out.println("Task-1 complete ....");
            return 100;
        };

        Supplier getOrangePrice = () -> {
            System.out.println("Task-2 going on ....");
            waitForSeconds(10);
            System.out.println("Task-2 complete ....");
            return  50;
        };

        CompletableFuture<Integer> runnableTask1 = CompletableFuture.supplyAsync(getMangoPrice);
        CompletableFuture<Integer> runnableTask2 = CompletableFuture.supplyAsync(getOrangePrice);

          CompletableFuture.allOf(CompletableFuture.supplyAsync(getMangoPrice), CompletableFuture.supplyAsync(getOrangePrice))
                        .thenApply(future -> {
                            try {
                                return  runnableTask1.get()
                                        + runnableTask2.get();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            }

                        }).thenAccept( totalValue -> System.out.print("total value of fruits  :" + totalValue)  );



        // System.out.println("total value of fruits  : " + totalFruitCost.get());
        // totalFruitCost.thenAccept( value -> System.out.print("total fruit value " + value));


        // totalFruitCost.thenAccept( System.out::print);
         // functional-Programming
        // Oops


        System.out.println("Last line of main thread");


        waitForSeconds(15);


    }

    public static void waitForSeconds(int seconds){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
