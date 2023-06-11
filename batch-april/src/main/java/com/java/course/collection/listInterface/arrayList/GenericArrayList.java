package com.java.course.collection.listInterface.arrayList;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class GenericArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(); //Generic form of ArrayList allow only homogenous data
        arr.add(10);
        arr.add(20);
        System.out.println("array list :" + arr);


        //ArrayList is not thread-safe

        CompletableFuture.runAsync(() ->  {
            System.out.println(arr);
            wait(10);
        });


        CompletableFuture.runAsync(() ->  {
            System.out.println(arr);
            wait(10);
        });


    }

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    1. How can we use thread-safe list
    2. How to traverse over list
    3. How to sort list

     */
}
