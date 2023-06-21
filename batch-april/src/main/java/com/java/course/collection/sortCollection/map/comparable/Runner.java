package com.java.course.collection.sortCollection.map.comparable;

import java.util.Map;
import java.util.TreeMap;

public class Runner {


    public static void main(String[] args) {
        Map<Employee, Employee> employeeMap = new TreeMap();


        Employee naresh = new Employee(45, "Naresn");
        Employee suresh = new Employee(32, "Suresh");
        Employee ramesh = new Employee(98, "Ramesh");

        employeeMap.put(naresh, naresh);
        employeeMap.put(suresh, suresh);
        employeeMap.put(ramesh, ramesh);

        System.out.println(employeeMap);


    }
}
