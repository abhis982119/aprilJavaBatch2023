package com.java.course.Oops.abstraction.abstractConcept.impl;

import com.java.course.Oops.abstraction.abstractConcept.api.Mammal;

public class Human  extends Mammal {
    @Override
    public void speak() {
        System.out.println("Hello!");
    }
}
