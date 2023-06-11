package com.java.course.collection.stackInterface.arraystack;

import java.util.Stack;
import java.util.Vector;

public class StackCharactersticks {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(10);
        stack.add(20);
        stack.add("abc");   // hetrogenous data
        stack.add(null);    // null-insertion
        ///---duplicate data  starts ---////
        stack.add(10);
        stack.add(20);
        stack.add("abc");
        stack.add(null);
        ///---duplicate data  starts ---////

        //supports presevation of insertion order

        System.out.println("stack data : " + stack);



    }
}
