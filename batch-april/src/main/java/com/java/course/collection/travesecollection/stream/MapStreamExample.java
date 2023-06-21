package com.java.course.collection.travesecollection.stream;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapStreamExample {


    public static void main(String[] args) {
        Map<String, String> countriesAndCapital = new LinkedHashMap<>();
        countriesAndCapital.put("India","Delhi" );
        countriesAndCapital.put("China","Beijing" );
        countriesAndCapital.put("USA","Washinton D.C" );


  //      countriesAndCapital.stream();  // ERROR : no stream method present for map interface

        /*
         Map doesnot support steams ,
         we need to get set or list out of map then  can  use stream  on list & set.


         */


    }
}
