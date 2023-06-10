package com.java.course.keywords.thisKeyword;

public final class GenericUtility {


    public static int getSalaryInCurrency(ThisKeyWord thisKeyWord,String currencyName ){
      return getSalaryInCurrency(thisKeyWord.getSalary(), currencyName);
    }

    public static int getSalaryInCurrency(int salary, String currencyName){
        switch (currencyName){

            case "Dollar" :
                return salary/82;

            case "Rupee":
                return salary;

            default:
                return salary;


        }

    }
}
