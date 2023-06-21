package com.java.course.collection.listInterface;

import java.util.Vector;

public class VectorCharactersticks {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add("abc");   // hetrogenous data
        vector.add(null);    // null-insertion
        ///---duplicate data  starts ---////
        vector.add(10);
        vector.add(20);
        vector.add("abc");
        vector.add(null);
        ///---duplicate data  starts ---////

        //supports presevation of insertion order

        System.out.println("vector data : " + vector);

    }
}
