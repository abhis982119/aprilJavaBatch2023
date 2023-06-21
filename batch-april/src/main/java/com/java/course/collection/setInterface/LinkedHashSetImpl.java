package com.java.course.collection.setInterface;

import java.util.LinkedHashSet;
import java.util.concurrent.CompletableFuture;

public class LinkedHashSetImpl {

    public static void main(String[] args) {

        LinkedHashSet set = new LinkedHashSet();
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


        CompletableFuture<Void> printSet = CompletableFuture.runAsync( () -> System.out.println("linkedhashset : " + set)); // methods are not synchronized
        CompletableFuture<Void> printSet2 = CompletableFuture.runAsync( () -> System.out.println("linkedhashset : " + set)); // methods are not synchronized


        System.out.println("linkedhashset : " + set); // insertion order is preserved
    }
}
