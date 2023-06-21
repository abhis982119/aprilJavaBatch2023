package com.java.course.collection.travesecollection.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExample {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        Iterator<Integer> itr = arr.iterator();

        arr.add(20);

        while(itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}
