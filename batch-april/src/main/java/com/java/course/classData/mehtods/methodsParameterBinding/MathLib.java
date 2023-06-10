package com.java.course.classData.mehtods.methodsParameterBinding;

public class MathLib  {


    public int getSquare(byte a){
        System.out.println("byte method is called with value  : " +  a);
        return a*a;
    }

    public int getSquare(short a){
        System.out.println("short method is called with value  : " +  a);
        return a*a;
    }



   //  -infinity to 0 +infinte without decimal or fraction



    // integer value with ranger of 21476xxxxx will be treated as int, unless explicitly typecasted or mentioned.
    public int getSquare(int a){
        System.out.println("int method is called with value  : " +  a);
        return a*a;
    }


    public long getSquare(long a){
        System.out.println("long method is called with value  : " +  a);
        return a*a;
    }



    public float getSquare(float a){
        System.out.println("float method is called with value  : " +  a);
        return a*a;
    }



    public double getSquare(Double a){
        System.out.println("float method is called with value  : " +  a);
        return a*a;

    }






}
