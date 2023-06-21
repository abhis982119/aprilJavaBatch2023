package com.java.course.collection.sortCollection.collectionsSortMethod;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(10);
        System.out.println("original array :  " + arr);

        Collections.sort(arr);
        System.out.println("sorted array :  " + arr);

    }
}
