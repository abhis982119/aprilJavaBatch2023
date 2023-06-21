package com.java.course.collection.listInterface.arrayList.synchronizedlist;

import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public class SyncronizedListExample {
    /*
      1. How can we use thread-safe list
      2. How to traverse over list
      3. How to sort list

       */
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        List<Integer> syncList =  Collections.synchronizedList(arr);
        arr.add(1000);
        arr.add(2000);

        CompletableFuture task1 = CompletableFuture.runAsync(  ()  -> {
            synchronized (syncList) {
                System.out.println(syncList);
                System.out.println("lock taken by thread 1 : dding value 10");
                wait(10);
                syncList.add(10);
                System.out.println("lock released by thread-1");
            }
        });


        CompletableFuture task2 = CompletableFuture.runAsync(  ()  -> {
            synchronized (syncList) {
                System.out.println("lock released by thread-2, adding value 80");
                wait(5);
                syncList.add(80);
                System.out.println(syncList);
                System.out.println("lock released by thread-2");


            }
        });

        wait(2);

        System.out.println("done with the rest of the code");
        syncList.add(90);
        syncList.add(100);

        System.out.println( "main thread printing array :" + syncList);

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
