package com.java.course.exceptionalHandling.throwsvsthrow;

import java.rmi.registry.Registry;

public class Runner {

   private static  MarriageRegistryService marriageRegistryService = new MarriageRegistryService();

    public static void main(String[] args)  throws  Exception   {

        Male ranbir = new Male("Ranbir", 18);
        Female alia = new Female("Alia", 20);

        marriageRegistryService.register(ranbir, alia);



    }
}
