package com.java.course.collection.travesecollection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamExample {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(10); //t1
        arr.add(20);
        arr.add(30); //t2
        arr.add(40);

       // arr.stream().forEach(value -> System.out.println(value));
        arr.parallelStream().forEach(value -> System.out.println(value));


        int sum = 0;
        List updateList =  arr.parallelStream().map(value -> value*10).collect(Collectors.toList());
        System.out.println("updated list : " + updateList);








    }



}
