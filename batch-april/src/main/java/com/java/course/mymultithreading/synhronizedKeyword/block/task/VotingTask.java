package com.java.course.mymultithreading.synhronizedKeyword.block.task;

import com.java.course.mymultithreading.synhronizedKeyword.block.realLifeObjects.VotingMachine;

public class VotingTask implements  Runnable {

   private VotingMachine votingMachine;

   public VotingTask(VotingMachine votingMachine){
       this.votingMachine = votingMachine;
   }

    @Override
    public void run(){

        try {
            votingMachine.putVote();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
