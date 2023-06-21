package com.java.course.collection.setInterface;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class HashSetImpl {

    public static void main(String[] args) {

        HashSet  set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add("abc");   // hetrogenous data allowed
        set.add("null");  // null insertion allowed
        set.add(10);
        set.add(20);     // duplicates not allowed
        set.add(30);
        set.add(40);
        set.add("abc");


        CompletableFuture<Void> printSet = CompletableFuture.runAsync( () -> System.out.println("hashset : " + set)); // methods are not synchronized
        CompletableFuture<Void> printSet2 = CompletableFuture.runAsync( () -> System.out.println("hashset : " + set)); // methods are not synchronized


        System.out.println("hashset : " + set); // insertion order is not preserved



    }
}
