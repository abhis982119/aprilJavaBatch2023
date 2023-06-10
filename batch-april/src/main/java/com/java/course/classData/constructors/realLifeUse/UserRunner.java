package com.java.course.classData.constructors.realLifeUse;

public class UserRunner {

    public static void main(String[] args){

               User user = User.builder()
                             .firstName("Abhishek")
                                .lastName("Sharma")
                                   .build();


        System.out.println(user);





    }
}
