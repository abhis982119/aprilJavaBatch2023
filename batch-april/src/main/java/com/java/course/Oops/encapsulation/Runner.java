package com.java.course.Oops.encapsulation;

public class Runner {

    public static void main(String[] args){

        Human human = new Human(18, true);
        System.out.println("Human is marriagble :  "  + human.isEligibleForMarriage());
        System.out.println("Human is eligible for voting :  "  + human.isEligibleForVoting());
        System.out.println("Human is eligible for  drinking :  "  + human.isEligibleForDrinking());
    }
}
