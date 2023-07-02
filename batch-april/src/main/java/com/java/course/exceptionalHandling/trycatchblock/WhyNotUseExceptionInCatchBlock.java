package com.java.course.exceptionalHandling.trycatchblock;

public class WhyNotUseExceptionInCatchBlock {





    public static void main(String[] args) {


        //   System.out.println("value returned : " + divide(10,null));

         int result =  divide(10, null);


        if(result >  0 ){
            System.out.println("value received : " +  result);
        }else if (result == -1){
            System.out.println("cannot divide by 0");
        }else if(result == -2 ){
            System.out.println("cannot divide by null");
        }else if(result == -3){
            System.out.println("error 500 ");
        }

    }

    public static  int divide( Integer a , Integer b){
       int result = -10;
        try {
            return a / b;
        }catch (ArithmeticException e){
           /* System.out.println("Exception arises : " + e.getMessage());*/
            result = Integer.MAX_VALUE;
        }catch (NullPointerException e){
            /*System.out.println("Exception arises : " + e.getMessage());*/
            result =  -2;
        }catch (Exception e){
          /*  System.out.println("Unknown exception arised : " + e.getMessage());*/
            result =   -3;
        }

        return result;


    }
}
