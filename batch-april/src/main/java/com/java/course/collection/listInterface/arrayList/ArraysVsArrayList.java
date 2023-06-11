package com.java.course.collection.listInterface.arrayList;

import java.util.ArrayList;

public class ArraysVsArrayList {

    public static void main(String[] args) {
        int[] arr = new int[5];  //20
        arr[0]  = 10;
        arr[1]  = 20;
        System.out.println("arr : " + arr);

        ArrayList arrayList = new ArrayList();  // 40bytes
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("abc");
        arrayList.add(null);
        //////
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("abc");
        arrayList.add(null);
        //////
        System.out.println("arrlist : "+ arrayList);


    }
}
