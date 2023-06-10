package com.java.course.mymultithreading.producerConsumerProblem;

import java.util.LinkedList;

public class PC {

   private LinkedList<String> queue = new LinkedList();

   private  int maxSize = 2;

   private int chipCount = 0;

   public synchronized void produce() throws InterruptedException {

       while(true) {

           System.out.println("starting producing chips at time : " + System.currentTimeMillis());
           if(queue.size() == maxSize){
               System.out.println("queue is full, stopping chip productio at : " + System.currentTimeMillis());
               wait();  // leave lock
           }

           while (queue.size() < maxSize) {
               String chipNumber = "Chips : " + ++chipCount;
               queue.add(chipNumber );
               System.out.println("added chip " + chipNumber);
               waitForSeconds(4);
           }



           notify();



       }
   }

   public synchronized void consume() throws InterruptedException {
       while(true) {


           System.out.println("Starting consuming chips at : " + System.currentTimeMillis());
           if (queue.isEmpty()) {
               System.out.println("all chips are  consumed, stopping consumption at  : " + System.currentTimeMillis());
               wait();
           }

           while (!queue.isEmpty()) {
               waitForSeconds(2);
               System.out.println("consumed chip " + queue.poll());
           }

           notify();

       }
   }


   public void waitForSeconds(int seconds){
       try {
           Thread.sleep(seconds*1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }

}
