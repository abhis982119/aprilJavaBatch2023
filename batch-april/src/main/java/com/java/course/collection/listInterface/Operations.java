package com.java.course.collection.listInterface;

import java.util.ArrayList;

public class Operations {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println("Default array : " + arr);
        System.out.println("size of arrat " + arr.size());

        arr.remove(2);
        System.out.println("remove data from 2nd index : " + arr);

        System.out.println("Is collection empty : " + arr.isEmpty());

        arr.addAll((ArrayList)arr.clone());

        System.out.println("after cloning and addAll :  " + arr);

        arr.clear();

        System.out.println("Is collection empty : " + arr.isEmpty());


    }
}
