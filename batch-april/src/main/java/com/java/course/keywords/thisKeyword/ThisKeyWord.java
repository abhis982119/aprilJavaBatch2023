package com.java.course.keywords.thisKeyword;

import lombok.Getter;


public class ThisKeyWord {

    private String name;

    private Integer salary =  149000;

    public ThisKeyWord(){

    }

    public ThisKeyWord(String name){
       this.name = name;
    }




    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ThisKeyWord{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public ThisKeyWord updateName(String name){
        this.name = name;
        return this;
    }


    public int getSalaryOfEmployeeIn(String currency){
       return  GenericUtility.getSalaryInCurrency(this, currency);
    }


    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }


}
