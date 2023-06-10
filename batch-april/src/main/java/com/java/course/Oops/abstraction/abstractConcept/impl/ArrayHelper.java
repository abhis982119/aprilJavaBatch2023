package com.java.course.Oops.abstraction.abstractConcept.impl;

public class ArrayHelper {

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
