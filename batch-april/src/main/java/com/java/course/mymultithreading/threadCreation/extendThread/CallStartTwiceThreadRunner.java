package com.java.course.mymultithreading.threadCreation.extendThread;

public class CallStartTwiceThreadRunner {

    /*
       New           : MyThread thread = new Thread()
       Ready         : thread.start()
       Running       : When thread scheduler provide the cpu, then thread will  be in running state
       Blocked       : when thread got interruped or it is in sleep mode
       Dead          : when run method execution ends.

     */

    public static void main(String[] args){
        MyThread thread = new MyThread();   // New
        thread.start();                    // Ready
        thread.start();
    }
}
