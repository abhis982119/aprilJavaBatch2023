package com.java.course.collection.mapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {

    public static void main(String[] args) {
         /*  HashMap      : not keep insertion order

           LinkedHashMap : keep insertion  order

           TreeMap       :   sort data

         */

        Map<String, String> countriesAndCapital = new LinkedHashMap<>();
        countriesAndCapital.put("India","Delhi" );
        countriesAndCapital.put("China","Beijing" );
        countriesAndCapital.put("USA","Washinton D.C" );  // insertion order is  preserved


        countriesAndCapital.put("India","Delhi" );   // no duplicate allowed for keys, it will perform update not add action

        countriesAndCapital.put("Unknown" , "Delhi");  // duplicate values are allowed


        countriesAndCapital.put("key", null); // null values are allowd for value


        countriesAndCapital.put(null, "value"); // null values are allowd for keys

        System.out.println(countriesAndCapital);




    }
}
