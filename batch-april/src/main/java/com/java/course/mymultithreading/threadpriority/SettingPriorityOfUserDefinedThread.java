package com.java.course.mymultithreading.threadpriority;

public class SettingPriorityOfUserDefinedThread {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Runnable task");
        };

        Thread thread = new Thread(task);
        thread.setName("runnable-thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Name of thread : " +  thread.getName());
        System.out.println("Priority of thread : " + thread.getPriority());


    }
}
