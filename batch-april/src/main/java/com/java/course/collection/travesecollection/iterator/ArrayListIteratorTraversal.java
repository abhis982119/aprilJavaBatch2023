package com.java.course.collection.travesecollection.iterator;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorTraversal {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
                     // <- 0 < 4
        arr.add(10); //  1 <= 4
        arr.add(20); // 2 <= 4
        arr.add(30); // 3 <= 4
        arr.add(40); // 4 <= 4

        Iterator<Integer> iterator = arr.iterator();

        while(iterator.hasNext()){
            int value = iterator.next();
            System.out.println(value);
            if(value == 20){
                iterator.remove();
                System.out.println(arr);
            }

        }

    }
}
