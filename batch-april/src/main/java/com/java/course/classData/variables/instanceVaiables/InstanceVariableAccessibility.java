package com.java.course.classData.variables.instanceVaiables;

public class InstanceVariableAccessibility   {


//instance variables are associated with Object and it's value and memory will be allocated everytime, object is created.

    private int a  ;

    public InstanceVariableAccessibility(int value) {
        this.a = value;
    }

    public  int getA() {
        return a;
    }

    public  void m1(){
        System.out.println(a);

    }


    @Override
    public String toString() {
        return  ""+a;


    }
}





    /*


    instance area --> we can access static as well as non-static : variables and methods


    static area ---> only static area methods and variables will be accessible
                     we won't be able to access instance area methods, variables.





       Default values are assigned to the variable in instance and static context for primitive type, for objects it will be null;
     */

