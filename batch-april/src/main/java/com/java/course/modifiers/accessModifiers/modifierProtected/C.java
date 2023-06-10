package com.java.course.modifiers.accessModifiers.modifierProtected;

public class C extends  A{


    public C() {
    }

    public C(String name, String address) {
        super(name, address);
    }

    @Override
     public  String getUuid(){
        return super.getUuid();
    }

    // public > protected > default > private
}
