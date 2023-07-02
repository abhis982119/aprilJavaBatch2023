package com.java.course.collection.mapInterface.innerImpl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Employee {

    public int empId;


    public String name;



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }


        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
     //   return getEmpId() == employee.getEmpId() && Objects.equals(getName(), employee.getName());
        return getEmpId() == employee.getEmpId() ;
    }

    @Override        // to find the bucket
    public int hashCode() {
    //    return Objects.hash(getEmpId(), getName());
        return ( empId %  16 );
    }
}
