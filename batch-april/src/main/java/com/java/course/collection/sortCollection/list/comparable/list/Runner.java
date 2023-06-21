package com.java.course.collection.sortCollection.comparable.list;

import com.java.course.collection.sortCollection.comparable.list.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {


    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        Employee suresh = new Employee(3, "Suresh");
        Employee ramesh = new Employee(2, "Ramesh");
        Employee jayesh = new Employee(1, "Jayesh");

        arr.add(suresh);
        arr.add(ramesh);
        arr.add(jayesh);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.print(arr);

    }
}
