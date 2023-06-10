package com.java.course.mymultithreading.threadCreation.implementRunnable;

public class RunnableTheadRunner {

    public static void main(String[] args){
        MyTheadRunnable task = new MyTheadRunnable();// not created
        Thread thread = new Thread(task);   // new
        thread.start();  //ready
    }
}
