package com.java.course.classData.variables.localVariables;

public class VariableLifeCycle {






    //life-cycle of variable
/*
    {
        int a = 10;

    }


    local variables are only accessible inside the curly braces of the conditional statements if declared there.


 */

    public static void main(String[] args){
        accessibility();
        nonInitializedLocalVariable();
    }


    public  static int  accessibility( ){
        int a = 1;


        int i ;
        for(  i = 0; i < a; i++){
            System.out.println(i);
        }

        for(  i = 0; i < a; i++){
            System.out.println(i);
        }




         return i ;

    }



    public static  void nonInitializedLocalVariable(){
        int a = 10  ;

        if(a > 10){
            //doSomething
        }



    }
}
