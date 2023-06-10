package com.java.course.stringManipulation.stringbufferclass;

public class StringVsStringBufferModification {


    public static void main(String[] args){

        //String
        String name = "Naresh"; //SCP
        String concated_name = name.concat(" MK");  //Naresh MK

        System.out.println("name : " + name);
        System.out.println("concated_name : " + concated_name);


        //StringBuffer
        StringBuffer buffer = new StringBuffer("Naresh");
        buffer.append(" MK");
        System.out.println("StringBuffer appended : " + buffer);


    }

}
