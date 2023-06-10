package com.java.course.mymultithreading.shutdownhook;

import javax.annotation.security.RunAs;

public class ShutDownHookExample {

    public static void main(String[] args) {

        System.out.println("Before  shutdown of jvm");

        Runnable cleanUpResourceTask = () -> {
            System.out.println("Release the database connection");
        };

        Runnable sendAlertTask = () -> {
            System.out.println("Sent alert(mail) to managers");
        };

        Thread cleanUpResouceThread = new Thread(cleanUpResourceTask);
        Thread sendAlertTaskThread = new Thread(sendAlertTask);

        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(cleanUpResouceThread);
        runtime.addShutdownHook(sendAlertTaskThread);

        System.exit(1);

        System.out.println("After shutdown of jvm");

    }
}
