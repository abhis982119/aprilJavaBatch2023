package com.java.course.collection.setInterface;

import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

public class TreeSetImpl {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(40);
        set.add(30);
        set.add(10);
        set.add(20);// Don't allow hetrogenous  allowed

        set.add(20); // duplicates not allowed
        set.add(40);
        set.add(30);
        set.add(10);

                       // not allowd - null insertion



        CompletableFuture<Void> printSet = CompletableFuture.runAsync( () -> System.out.println("treeset : " + set)); // methods are not synchronized
        CompletableFuture<Void> printSet2 = CompletableFuture.runAsync( () -> System.out.println("treeset : " + set)); // methods are not synchronized



                                                      // data will be sorted by default
        System.out.println("treeset : " + set); // insertion order is NOT preserved

    }

}
