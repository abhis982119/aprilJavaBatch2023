package com.java.course.collection.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMapImpl {


    /*
        {
            Key       value
          "India" : "Delhi",      //  :  Entry<Key, Value>
          "China" : "Beijing",
          "America" : "Washington D.C"
        }
                          0       1         2
    countries[]  :    [ India   China     America   ]

    capitals[]  :    [ Delhi    Beijing    Washington D.C ]
     */

    public static void main(String[] args){

        /*  HashMap      : not keep insertion order

           LinkedHashMap : keep insertion  order

           TreeMap       :   sort data

         */

        Map   countriesAndCapital = new HashMap<>();
        countriesAndCapital.put("India","Delhi" );
        countriesAndCapital.put("China","Beijing" );
        countriesAndCapital.put("USA","Washinton D.C" );  // insertion order is not preserved


        countriesAndCapital.put("India","Delhi" );   // no duplicate allowed for keys, it will perform update not add action

        countriesAndCapital.put("Unknown" , "Delhi");  // duplicate values are allowed


        countriesAndCapital.put("key", null); // null values are allowd for value


        countriesAndCapital.put(null, "value"); // null values are allowd for keys

        countriesAndCapital.put(123, 123);  // allow heterogeneous data





        System.out.println(countriesAndCapital);




    }

}
