package com.java.course.mymultithreading.synhronizedKeyword.methods.tasks;

import com.java.course.mymultithreading.synhronizedKeyword.methods.reallifeobjects.WashRoom;

import java.util.concurrent.Callable;

public class SinkTask  implements  Runnable{

    private WashRoom washRoom;

    public SinkTask(WashRoom washRoom){
        this.washRoom = washRoom;
    }

    @Override
    public void run(){
        washRoom.useSink();
    }
}
