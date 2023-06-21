package com.java.course.collection.sortCollection.collectionsSortMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetSorting {

    public static void main(String[] args) {

        /*

        Collection.sort() method works only with list : The methods is not overloaded for taking set or map.
         */
        LinkedHashSet<Integer> arr = new LinkedHashSet<>();
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(10);
        System.out.println("original array :  " + arr);

        //      Collections.sort(arr);
        System.out.println("sorted array :  " + arr);

    }
}
