package com.java.course.stringManipulation.stringbufferclass;

public class StringVsStringBufferEqualsMethod {

    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");

        if(str1.equals( str2)){
            System.out.println("str1 equls str2");
        }else{
            System.out.println("str1 not equls str2");
        }


        //StringBuffer

        StringBuffer strBuffer1 = new StringBuffer("abc");
        StringBuffer strBuffer2 = new StringBuffer("abc");





        if(strBuffer1.equals( strBuffer2)){
            System.out.println("strBuffer1 equls str2");
        }else{
            System.out.println("strBuffer2 not equls str2");
        }


    }
}
