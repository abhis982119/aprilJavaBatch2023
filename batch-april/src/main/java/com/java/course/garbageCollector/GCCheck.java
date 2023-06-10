package com.java.course.garbageCollector;

public class GCCheck {

    public static void main(String[] args){
        A a = new A();
        a = null;
        System.gc();

        for(int i = 0; i <  1000000000; i++){

        }

    }
}
