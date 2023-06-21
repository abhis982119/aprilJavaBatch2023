package com.java.course.collection.sortCollection.mycomparator.list;

import com.java.course.collection.sortCollection.mycomparator.list.Employee;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.name.compareTo(o2.name);
    }
}
