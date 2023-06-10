package com.java.course.modifiers.accessModifiers.modifierProtected;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
  public class A {

    String uuid = UUID.randomUUID().toString();


         public  A(String name, String address) {
            this.name = name;
            this.address = address;
        }


        protected String name;

    protected String address;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected String getUuid(){
        return uuid;
    }


}
