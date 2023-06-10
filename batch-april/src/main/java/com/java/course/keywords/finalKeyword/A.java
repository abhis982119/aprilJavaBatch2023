package com.java.course.keywords.finalKeyword;

import java.util.HashMap;
import java.util.Map;

   class A {

    public A(String birthState) {
        this.birthState = birthState;
    }

    private String firstName ;

    private  String address;

    private final String birthState  ;

    private  Map<String, Integer>  salaryDetails = new HashMap<>();

    public Map<String, Integer> getSalaryDetails() {
        return salaryDetails;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", birthState='" + birthState + '\'' +
                '}';
    }

    public A(String firstName, String address, String birthState,    Map<String, Integer>  salaryDetails ) {
        this.firstName = firstName;
        this.address = address;
        this.birthState = birthState;
        this.salaryDetails = salaryDetails;
    }



    public String getBirthState() {
        return birthState;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public final float totalMoneyMadePostTax(){
        return totalMoneyMade()*0.7f;
    }

    private int totalMoneyMade(  ){
        int totalSalary = 0 ;
        for(String year : salaryDetails.keySet())
            totalSalary += salaryDetails.get(year);
        return totalSalary;
    }


}
