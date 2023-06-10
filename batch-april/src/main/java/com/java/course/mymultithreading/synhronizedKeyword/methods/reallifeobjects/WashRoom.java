package com.java.course.mymultithreading.synhronizedKeyword.methods.reallifeobjects;



public class WashRoom {


    public synchronized void useToilet() throws InterruptedException {

        System.out.println(" toilet is being used by " + Thread.currentThread().getName());
        wait(); // state : waiting state ,   lock : release
        //waitForSeconds(5);
        System.out.println(" toilet is being released by " + Thread.currentThread().getName());
        notifyAll();
    }


    public synchronized  void useSink(){
        System.out.println(" sink is being used by " + Thread.currentThread().getName());
        waitForSeconds(2);
        System.out.println(" sink is being released by " + Thread.currentThread().getName());
        notifyAll();
    }

    private void waitForSeconds(int second)  {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
