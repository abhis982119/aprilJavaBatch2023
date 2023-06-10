package com.java.course.stringManipulation.stringclass;

public class StringBuilderExample {


    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Naresh ");
        System.out.println("stringbuilder object : " + sb);

        sb.append(" MK");

        System.out.println("stringbuilder object : " + sb);
    }
}
