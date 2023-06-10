package com.java.course.classData.mehtods.general;

public class OuterClass {






    public void m1(){
        System.out.println("m1 method of outerclass ");
        InnerClass innerClass = new InnerClass();
        innerClass.m1();

    }


    private void m2(){

    }


      class InnerClass{

          String password = "abcde";
          public void m1(){
              System.out.println("m1 method of inner class");
          }

          public String getPassword(){
              return  password;
          }
      }

}
