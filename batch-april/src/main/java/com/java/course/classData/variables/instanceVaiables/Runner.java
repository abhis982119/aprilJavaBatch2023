package com.java.course.classData.variables.instanceVaiables;

public class Runner {

    public static void main(String[] args){
/*
        for(int i = 0; i < 5 ; i++) {
            InstanceVariableAccessibility accessibility = new InstanceVariableAccessibility(5);
            System.out.println( accessibility.getA());

        }*/


        InstanceVariableAccessibility iv1 = new InstanceVariableAccessibility(10);
        InstanceVariableAccessibility iv2 = new InstanceVariableAccessibility(20);


        System.out.println(" iv1 " + iv1);
        System.out.println(" iv2 " + iv2);

    }
}
