package com.java.course.collection.setInterface.synchronizedSet;

import lombok.SneakyThrows;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SynchronizedSetImpl {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer> syncSet =  Collections.synchronizedSet(set);

        performThreadOperations(syncSet);

        wait(5);
        System.out.println("Original list : " + set);

    }

    public static void performThreadOperations(Set syncSet){


        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {

            synchronized (syncSet) {
                System.out.println("thread-1 taken lock of list");
                wait(5);
                syncSet.add(50);
                System.out.println("thread-1 released lock of list");
            }


        });


        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {


            synchronized (syncSet) {
                System.out.println("thread-2 taken lock of list");
                wait(5);
                syncSet.add(60);
                System.out.println("thread2 : "+ syncSet);
                System.out.println("thread-2 released lock of list");
            }

        });

        System.out.println("main thread : " + syncSet);

        wait(20);
    }



    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
