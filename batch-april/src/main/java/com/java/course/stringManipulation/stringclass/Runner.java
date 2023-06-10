package com.java.course.stringManipulation.stringclass;

public class Runner {


    public static void main(String[] args){




       String name1 = new String("Abhishek"); //  1 object created in heap memory
       String name2 = new String("Abhishek"); // 1 object created in heap memory

       String candidate1 = "Naresh";  // 1 object will be created in SCP
       String candidate2 = "Naresh"; //  0 object will be created






        System.out.println("candidate1 : " + candidate1);
        System.out.println("candidate2 : " + candidate2);


        candidate2 = "Abhishek";  // 1 object will be created  in SCP

        System.out.println("candidate1 : " + candidate1);
        System.out.println("candidate2 : " + candidate2);



       /*        primitive datatype             other
        == :       compare values            it will compare  allocated  memory address
        */

    }

    /*
    ---                                 ---------        -----------
    main-stack                          Heap              StringConstant Pool (SCP)
    ---                                 ---------        -------------
    String args[] = null;
    String name1            ------------>Abhishek
    String name2           ------------->Abhishek

    String candidate1                ------------------->   Naresh
    String candidate2                ------------------->   Abhishek
    ---


    ---


     */


    /*
    String Constant Pool : SCP

    String c1
     */
}
