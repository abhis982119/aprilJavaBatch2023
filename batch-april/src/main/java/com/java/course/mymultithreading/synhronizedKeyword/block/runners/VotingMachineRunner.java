package com.java.course.mymultithreading.synhronizedKeyword.block.runners;

import com.java.course.mymultithreading.synhronizedKeyword.block.task.VotingTask;
import com.java.course.mymultithreading.synhronizedKeyword.block.realLifeObjects.VotingMachine;

public class VotingMachineRunner {


    public static void main(String[] args) throws  Exception {

        VotingMachine votingMachine = new VotingMachine();

        VotingTask votingTask = new VotingTask(votingMachine);

        Thread ramesh = new Thread(votingTask);
        ramesh.setName("Ramesh");

        Thread suresh = new Thread(votingTask);
        suresh.setName("Suresh");

        Thread rajesh = new Thread(votingTask);
        rajesh.setName("rajesh");

        Thread mahesh = new Thread(votingTask);
        mahesh.setName("mahesh");

        ramesh.start();
        suresh.start();
        rajesh.start();
        mahesh.start();


        ramesh.join();
        suresh.join();
        rajesh.join();
        mahesh.join();





        System.out.println("total votes received : " + votingMachine.getVoteCount());

    }
}
