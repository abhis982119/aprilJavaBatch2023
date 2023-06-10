package com.java.course.mymultithreading.synhronizedKeyword.block.realLifeObjects;

import lombok.Getter;

@Getter
public class VotingMachine {

    private int voteCount ;  // ramesh : 1, mahesh : 1


    public void putVote() throws Exception{
        System.out.println(Thread.currentThread().getName() + " voting started");
        waitForSeconds(5);
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + "  synchronized area started");
            wait(10000);
            voteCount = voteCount + 1;
            System.out.println(Thread.currentThread().getName() + "  synchronized area ended");
        }
        System.out.println(Thread.currentThread().getName() + " voting ended");

    }

    private void waitForSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
