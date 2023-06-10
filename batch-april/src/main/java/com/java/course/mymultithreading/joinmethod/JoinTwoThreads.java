package com.java.course.mymultithreading.joinmethod;

public class JoinTwoThreads {

    /*
        1. Boy-girl meet and agree
        2. parent with pandits will decide a date
        3. cards  will be printed. // Ram    : 4pm
        4. venue will be booked.   // Shaym  : 4pm
        5. marriage happens

        after task 2 :   3 & 4 task independently
        after task 4 :  task 5 can execute


     */


    public static void main(String[] args) throws InterruptedException {

       Thread boyGirlMet = new Thread(){

           @Override
           public void run(){
               System.out.println("Boy girl met & agreed to marry.");
           }
       };


        Thread panditDecideDate = new Thread(){

            @Override
            public void run(){
                System.out.println("Date fixed ");
            }
        };


        Thread ramBookVenue = new Thread(){

            @Override
            public void run(){
                System.out.println("Ram booked a venue.");
            }
        };


        Thread shayamPrintCard = new Thread(){

            @Override
            public void run(){
                System.out.println("Shayam printed cards.");
            }
        };


        Thread coupleGetMarried = new Thread(){

            @Override
            public void run(){
                System.out.println("Couple married.");
            }
        };



        boyGirlMet.start();
        boyGirlMet.join(2000);


        panditDecideDate.start();
        panditDecideDate.join(2000);


        shayamPrintCard.start();

        ramBookVenue.start();
        ramBookVenue.join();


        coupleGetMarried.start();

    }
}
