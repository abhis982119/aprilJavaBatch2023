package com.java.course.stringManipulation.stringclass;

public class StringConstantPool  {

    /* Primitive data type
    Number   : byte, short, int, long,  float, double
    Alphabet : char
    boolean  : boolean
     */

    /*
    primitive   Wrapper class

 1.   byte      : Byte
 2.   short     : Short
 3.   int       : Integer
 4.   long      : Long
 5.   float     : Float
 6.   double    : Double

 7.   char      : Character

 8.   boolean   : Boolean

 9.     -       : String

     */

//                                012345
    private static String name = "Naresh MK";


    public static String getSubString(int start, int end){
        return name.substring(start, end);
    }



}
