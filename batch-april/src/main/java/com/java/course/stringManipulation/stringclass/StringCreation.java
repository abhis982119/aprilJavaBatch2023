package com.java.course.stringManipulation.stringclass;

public class StringCreation {

    public static void main(String[] args){


        String str="ratan";  //SCP
        System.out.println(str);
        String str1=new String("ratan"); //heap
        System.out.println(str1);


        char[] ch={'r','a','t','a','n'};
        String str3=new String(ch);
        System.out.println(str3);


        char[] ch1={'a','r','a','t','a','n','a'};
        String str4=new String(ch1,1,5);
        System.out.println(str4);


        byte[] b={65,66,67,68,69,70};  //ASCII 0 - 127   // byte range : -128 to 127
        String str5=new String(b);
        System.out.println(str5);


        byte[] b1={65,66,67,68,69,70};
        String str6=new String(b1,2,4);
        System.out.println(str6);
    }
}
