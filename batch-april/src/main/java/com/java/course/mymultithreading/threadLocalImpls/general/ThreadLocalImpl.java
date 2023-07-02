package com.java.course.mymultithreading.threadLocalImpls.general;

import java.util.concurrent.CompletableFuture;

public class ThreadLocalImpl {

    public static void main(String[] args) {

        ThreadLocal threadLocal = new ThreadLocal(){

            @Override
            public Object initialValue(){
                return "default value";
            }

        };


        System.out.println(threadLocal.get());


        threadLocal.set(1);
        System.out.println(threadLocal.get());


        threadLocal.set(2);
        System.out.println(threadLocal.get());


        threadLocal.remove();
        System.out.println(threadLocal.get());


        CompletableFuture.runAsync( () -> {
            System.out.println(" completable future thread value :  "  +  threadLocal.get());
        });



    }

}
