package com.java.course.collection.sortCollection.comparable.list;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Employee implements  Comparable {

    public int empId;


    public String name;


    @Override
    public int compareTo(Object o) {

      Employee otherEmp = (Employee)  o;

      return   this.empId - otherEmp.empId  ;

    }
}
