package com.java.course.collection.listInterface.arrayList.synchronizedlist;

import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
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

        CompletableFuture task1 = CompletableFuture.runAsync(  ()  -> { System.out.println(syncList); syncList.add(10); wait(10);});
        CompletableFuture task2 = CompletableFuture.runAsync(  ()  -> {System.out.println(syncList); wait(10);});

    }



    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
