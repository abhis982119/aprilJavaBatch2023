package com.java.course.stringManipulation.stringclass;

public class StringCompareTo {


    public static void main(String[] args){
        String str1 = "a";
        String str2 = "d";

        int result = str2.compareTo(str1);
        System.out.println("result value is : " + result);


        String name = "Naresh MK";
        System.out.println("name starts with Naresh : " + name.startsWith("Naresh"));
        System.out.println("name ends with Naresh : " + name.endsWith(" MK"));


    }
}
