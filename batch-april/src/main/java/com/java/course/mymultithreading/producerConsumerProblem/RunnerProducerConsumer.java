package com.java.course.mymultithreading.producerConsumerProblem;

public class RunnerProducerConsumer {

    public static void main(String[] args) {
        PC pc = new PC();


        Producer produceTask = new Producer(pc);
        Thread producer = new Thread(produceTask);

        Consumer consumerTask = new Consumer(pc);
        Thread consumer = new Thread(consumerTask);


        producer.start();
        consumer.start();


    }
}
