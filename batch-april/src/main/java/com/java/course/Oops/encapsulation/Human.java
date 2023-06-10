package com.java.course.Oops.encapsulation;

public class Human {

      private int age ;   // instance variable

          private static boolean isMale;  // static variable


      public void m1(){
          int salary = 20000000; //local-variable
      }

      public Human(int age, boolean isMale){
          this.age = age;
          this.isMale = isMale;
      }


      public boolean isEligibleForMarriage(){
          if( isMale ){
              return age >= 21;
          }else{
              return age >= 18;
          }
      }

      public boolean isEligibleForVoting(){
          return age >= 18;
      }


      public boolean isEligibleForDrinking(){
          return age >= 25;
      }
}
