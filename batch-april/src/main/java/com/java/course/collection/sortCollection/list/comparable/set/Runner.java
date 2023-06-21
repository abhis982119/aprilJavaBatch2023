package com.java.course.collection.sortCollection.list.comparable.set;

import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>();
        set.add(new Employee(2, "Naresh"));
        set.add(new Employee(1, "Suresh"));

        System.out.println("treeset : " + set);
        

    }
}
