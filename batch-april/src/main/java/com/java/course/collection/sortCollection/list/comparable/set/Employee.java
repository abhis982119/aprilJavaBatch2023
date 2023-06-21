package com.java.course.collection.sortCollection.list.comparable.set;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee implements  Comparable<Employee> {

    private  int empId;

    private String name;

    @Override
    public int compareTo(Employee emp) {
        return  this.empId - emp.empId;
    }
}
