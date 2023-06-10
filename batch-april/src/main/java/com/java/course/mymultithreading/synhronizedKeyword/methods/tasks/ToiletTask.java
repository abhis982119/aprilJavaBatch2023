package com.java.course.mymultithreading.synhronizedKeyword.tasks;

import com.java.course.mymultithreading.synhronizedKeyword.methods.reallifeobjects.WashRoom;

public class ToiletTask implements Runnable{

    private WashRoom washRoom;

    public ToiletTask(WashRoom washRoom) {
        this.washRoom = washRoom;
    }

    @Override
    public void run() {
        try {
            washRoom.useToilet();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
