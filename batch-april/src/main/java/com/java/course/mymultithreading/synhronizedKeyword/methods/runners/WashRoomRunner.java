package com.java.course.mymultithreading.synhronizedKeyword.methods.runners;

import com.java.course.mymultithreading.synhronizedKeyword.methods.reallifeobjects.WashRoom;
import com.java.course.mymultithreading.synhronizedKeyword.methods.tasks.SinkTask;
import com.java.course.mymultithreading.synhronizedKeyword.tasks.ToiletTask;

public class WashRoomRunner {

    public static void main(String[] args) throws InterruptedException {

        WashRoom washRoom = new WashRoom();
        WashRoom newWashRoom = new WashRoom();

        ToiletTask useToiletTask = new ToiletTask(washRoom);
        ToiletTask useNewToiletTask = new ToiletTask(washRoom);

        SinkTask useSinkTask = new SinkTask(washRoom);

        Thread ramesh = new Thread(useToiletTask); //state : new
        ramesh.setName("Ramesh");
        Thread suresh = new Thread(useNewToiletTask);  //state : new
        suresh.setName("Suresh");






        ramesh.start();   // state : ready
        suresh.start();  // state : ready





        Thread pramesh = new Thread(useSinkTask);
        pramesh.setName("pramesh");
        pramesh.start();               // state : ready


        }


}
