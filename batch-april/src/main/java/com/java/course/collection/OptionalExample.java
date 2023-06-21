package com.java.course.collection;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str = null;
      //  addSalutation(str);
        addSalutationInFunctionalManner(Optional.ofNullable("Naresh"));
    }

    public static  void addSalutationInFunctionalManner(Optional<String> maybeStr){


       maybeStr.map(
               str -> {String ups =  str.concat(" Garu");
               System.out.println(ups);
               return ups;
               })
               .orElseGet(
                       () -> {
                           System.out.print("Empty string : please provide a valid value");
                           return null;
                       });


    /*    System.out.println(updatedString);*/
    }




    /*public static  void addSalutation(String str){

        if(str == null ){
            System.out.println("Empty string : please provide a valid value");
            return ;
        }

        String updatedString  =  str.concat(" Garu");

        System.out.println(updatedString);
    }*/
}
