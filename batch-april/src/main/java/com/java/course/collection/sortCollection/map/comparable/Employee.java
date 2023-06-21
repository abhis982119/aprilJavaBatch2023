package com.java.course.collection.sortCollection.map.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Employee implements Comparable<Employee>  {

    private int empId;

    private String name;

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.getEmpId();
    }
}
