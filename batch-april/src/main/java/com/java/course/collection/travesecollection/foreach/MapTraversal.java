package com.java.course.collection.travesecollection.foreach;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTraversal {

    public static void main(String[] args) {
        Map<String, String> countriesAndCapital = new LinkedHashMap<>();
        countriesAndCapital.put("India","Delhi" );
        countriesAndCapital.put("China","Beijing" );
        countriesAndCapital.put("USA","Washinton D.C" );


        // [ 1,2,3,4 ]

        // [ {key1, value1} , {key2, value2 }]   : entrySet()  : return set of entry
        //   [key1, key2]                        : keySet()    : return set of key
        //   [value1, value2]                    : value()     : return collection of values


        for(Map.Entry<String, String> entry : countriesAndCapital.entrySet()){
            System.out.println(" key " + entry.getKey() );
            System.out.println(" value " + entry.getValue() );
        }


        for(String key : countriesAndCapital.keySet()){

            System.out.println("key fetched : "  + key );
        }


        for(String value : countriesAndCapital.values()){
            System.out.println("value fetched : " + value);
        }

    }
}
