package com.java.course.stringManipulation;

import java.util.StringTokenizer;

public class StringTokenizerExample {


    //main-thead
    public static void main(String[] args){
          String str = "Hi everyone how are you ";

          StringTokenizer tokenizer = new StringTokenizer(str,",");

         while(tokenizer.hasMoreTokens()){
             System.out.println(tokenizer.nextToken());
         }

        String str2 = "Hi everyone how are you ";

        StringTokenizer tokenizer2 = new StringTokenizer(str2,",");

        while(tokenizer2.hasMoreTokens()){
            System.out.println(tokenizer2.nextToken());
        }
// single waiter : 3 mins
// two waiter :    1 mins
    }

    /*
    main() thread -->

    ------
    main()
    -----
    string[] args
    -----

     */
}
