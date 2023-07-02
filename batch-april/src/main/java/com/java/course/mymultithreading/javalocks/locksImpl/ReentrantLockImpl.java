package com.java.course.mymultithreading.javalocks.locksImpl;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImpl {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();



        System.out.println("isLocked : " + lock.isLocked());  //true
        System.out.println("isHeldByCurrentThread : " + lock.isHeldByCurrentThread()); //true
        System.out.println("getQueueLength : " + lock.getQueueLength()); //0

        lock.unlock();

        System.out.println("getHoldCount " + lock.getHoldCount()); //1
        System.out.println("isLocked : " + lock.isLocked()); //true

        lock.unlock();

        System.out.println("isLocked : " + lock.isLocked()); //false
        System.out.println("isFair : " + lock.isFair());  //false





    }
}
