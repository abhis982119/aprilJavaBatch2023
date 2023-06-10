package com.java.course.keywords.finalKeyword;

import java.util.HashMap;
import java.util.Map;




/*
 variable :  cannot reassign value     ( constant )  // all constants outside enum and interface
 method   :  cannot be over-riden
 class    :  cannot be extends                       // util files should be final
 */

public class Runner {

    public static void main(String[] args){

        Map<String, Integer> salaryDetails = new HashMap<>();
        salaryDetails.put("2022", 5);
        salaryDetails.put("2023", 10);
        salaryDetails.put("2024", 15);
        B a = new B("Naresh", "Karnataka", "Hyderabad", salaryDetails);
        System.out.println("At 2022 : " + a);
        a.setAddress("Pune");
        System.out.println("At 2023 : " + a);

        System.out.println("At 2024  : " + a);



       System.out.println("total money made by   " + a.getFirstName() + " post tax " +  a.totalMoneyMadePostTax() + " lakhs");


    }
}
