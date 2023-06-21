package com.java.course.collection.sortCollection.mycomparator.list;

import com.java.course.collection.sortCollection.mycomparator.list.EmpNameComparator;
import com.java.course.collection.sortCollection.mycomparator.list.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
         Employee suresh = new  Employee(3, "C");
         Employee ramesh = new  Employee(2, "A");
         Employee jayesh = new Employee(1, "B");

        arr.add(suresh);
        arr.add(jayesh);
        arr.add(ramesh);


        System.out.println(arr);

      // Collections.sort(arr, new EmpIdComparator());
        Collections.sort(arr, new EmpNameComparator());

        System.out.print(arr);
    }
}
