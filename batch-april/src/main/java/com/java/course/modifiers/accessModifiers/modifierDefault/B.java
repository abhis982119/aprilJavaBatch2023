package com.java.course.modifiers.accessModifiers.modifierDefault;

import com.java.course.modifiers.accessModifiers.modifierProtected.A;

public class B extends A {


    public B(String name, String address) {
        super(name, address);
    }

    public String getAddress(){
        return super.getAddress();
    }

    @Override
      public  String getName(){
        return super.getName();
    }


// public > proctected > default > private
}
