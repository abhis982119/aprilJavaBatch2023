package com.java.course.Oops.abstraction.abstractConcept.impl;

import com.java.course.Oops.abstraction.abstractConcept.api.Mammal;

public class Cat  extends Mammal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
