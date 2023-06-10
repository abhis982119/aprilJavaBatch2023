package com.java.course.garbageCollector;

import javax.security.sasl.SaslServer;

public class A extends Object {

    @Override
   public void finalize(){
        System.out.println("Object deleting ....");
        int a = 10/0;
        System.out.println("Object deleted.");
   }
}
