package com.java.course.classData.mehtods.general;

public class JavaMethods  {
    /*
      Types of methods :-
      1. Instance methods
      2. static methods
     */



    private  int instanceVariable ;
    private static int staticVariable;



    //instance method
    public void instanceMethod(){
        System.out.println("start - instance method ");
        m1();
        System.out.println("end - instance method ");
    }
    public void m1(){
        System.out.println("start - m1 method");
        m2();
        System.out.println("end - m1 method");
    }

    public void m2(){
        System.out.println("start - m2  method");
        System.out.println("end - m2  method");
    }





    //static method
    public static void staticMethod(){
        System.out.println(" staticVariable   value :   " + staticVariable);
        System.out.println("static method of class JavaMethods" );
    }





}
