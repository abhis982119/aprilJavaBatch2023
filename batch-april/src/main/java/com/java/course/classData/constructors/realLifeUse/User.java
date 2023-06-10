package com.java.course.classData.constructors.realLifeUse;


import lombok.*;

@Setter
@Getter
@Builder
public class User {

    private String firstName;
    private String lastName;


    private String address;

    private int age;

    private short language;


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", language=" + language +
                '}';
    }
}
