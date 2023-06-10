package com.java.course.Oops.general;


//Naresh
public class User extends Object {

   private UserName userName;

   private Address address;

    private int age;

    private String education;

    private String emailId;

    private String phoneNumber;

    private String relationShipStatus;


    private String password;

    private String userUniqueName;



    public boolean login (String userUniqueName, String password){
        if(this.password == password && this.userUniqueName == userUniqueName){
            System.out.println("login successful");
            return true;
        }
        return false;

    }




}
