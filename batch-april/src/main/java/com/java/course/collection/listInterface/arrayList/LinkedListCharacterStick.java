package com.java.course.collection.listInterface.arrayList;

import java.util.LinkedList;

public class LinkedListCharacterStick {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add("abc");   // hetrogenous data
        list.add(null);    // null-insertion
        ///---duplicate data  starts ---////
        list.add(10);
        list.add(20);
        list.add("abc");
        list.add(null);
        ///---duplicate data  starts ---////

        //supports presevation of insertion order

        System.out.println("list data : " + list);
    }
}
