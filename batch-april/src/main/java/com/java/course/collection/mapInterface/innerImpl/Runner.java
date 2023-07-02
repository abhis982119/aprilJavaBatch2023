package com.java.course.collection.mapInterface.innerImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Runner {

    public static void main(String[] args){
        Employee naresh = new Employee(1, "Naresh");
        Employee suresh = new Employee(2, "Suresh");
        Employee mikasa = new Employee(1, "Mukesh");



        Map<Employee, Employee> employeeMap = new LinkedHashMap<>();
        employeeMap.put(naresh, naresh); // hashcode : 1 (bucket) -  add entry
        employeeMap.put(suresh, suresh); // hashcode : 2 (bucket) -  add entry
        employeeMap.put(mikasa, mikasa); // hashcode : 1 (bucket ) - update value
                                         //  colliion


        mikasa = null;


        System.out.println(employeeMap);
        System.out.println("Size of the collection : " + employeeMap.size());
    }
}
