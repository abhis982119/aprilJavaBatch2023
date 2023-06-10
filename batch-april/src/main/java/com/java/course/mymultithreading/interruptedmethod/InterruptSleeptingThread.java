package com.java.course.mymultithreading.interruptedmethod;

public class InterruptSleeptingThread {

    public static void main(String[] args) {
        Runnable task = () -> {
          try {
              System.out.println("Runnable thread started ");
              Thread.sleep(4000);
              System.out.println("Runnable thread ends ");

          }catch (Exception e){
              System.out.println("Exception arises : " + e.getMessage());
          }
        };

        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
    }
}
