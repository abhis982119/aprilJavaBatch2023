package com.java.course.collection.sortCollection.set;



import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee(2, "Naresh"));
        set.add(new Employee(1, "Suresh"));
        set.add(new Employee(3, "Ramesh"));
        set.add(new Employee(4, "Jayesh"));

        System.out.println("hashset : " + set);

        List<Employee> list = set.stream().collect(Collectors.toList());
        System.out.println("createdlist from set : " + list);
        Collections.sort(list, new EmpIdComparator());
        System.out.println("sorted list  : " + list);
    }
}
