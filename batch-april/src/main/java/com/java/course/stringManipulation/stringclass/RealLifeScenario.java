package com.java.course.stringManipulation.stringclass;

public class RealLifeScenario {


    public void putDataInDatabaseIfValuesAreDifferent(int a, int b ){

        if( a == b){
            System.out.print("Don't put data into database ");
        }else{
            System.out.print(" put data into database ");
        }
    }
}
