package com.java.course.exceptionalHandling.throwsvsthrow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Human {

    private  String name ;

    private final Integer age;

    private final String gender;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Human(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
