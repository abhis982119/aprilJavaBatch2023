package com.java.course.mymultithreading.threadCreation.usingAnonamousClass;

import com.java.course.modifiers.accessModifiers.modifierPrivate.Runn;

public class AnonamousRunner {

    public static void main(String[] args){

        Runnable task = new  Runnable(){

            @Override
            public void run(){
                System.out.println("Annonanous task ");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

    }
}
