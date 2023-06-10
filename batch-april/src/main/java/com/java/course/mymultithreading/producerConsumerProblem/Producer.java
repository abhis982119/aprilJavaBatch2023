package com.java.course.mymultithreading.producerConsumerProblem;

public class Producer implements  Runnable {


    private PC pc;

    public Producer(PC pc) {
        this.pc = pc;
    }

    @Override
    public void run() {
        try {
            pc.produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
