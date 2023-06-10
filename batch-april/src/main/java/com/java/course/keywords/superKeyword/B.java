package com.java.course.keywords.superKeyword;

import com.java.course.keywords.thisKeyword.GenericUtility;

public class B extends  A{


    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public B(){

    }


    public float makeSalary(){
        System.out.println("starting Mammal-m1()");
          this.salary =   GenericUtility.getSalaryInCurrency(salary, "Dollar");
         return  super.makeSalary(this);


    }

    public void m2(){
        System.out.println("Mammal-m2()");
    }
}
