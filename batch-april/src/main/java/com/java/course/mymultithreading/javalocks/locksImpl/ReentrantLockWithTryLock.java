package com.java.course.mymultithreading.javalocks.locksImpl;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithTryLock {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        CompletableFuture.runAsync( () -> {
            lock.lock();
            System.out.println("Locked the object and will wait for 10 sec");
            waitForSeconds(10);
            System.out.println("Going to unlock ");

        });

        CompletableFuture.runAsync(() -> {
            if(lock.tryLock()){   // try to get lock, if at that moment lock is not available,
                                 // leave it and perform other operations & if block will never be executed.

                System.out.println("lock acquired, and will be left immediately");
            }else{
                System.out.println("Tried to acquire lock but attempt failed.");
            }
        });

        waitForSeconds(12);
    }

    @SneakyThrows
    public static void waitForSeconds(int seconds){
            Thread.sleep(seconds*1000);
    }
}
