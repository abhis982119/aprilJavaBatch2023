package com.java.course.exceptionalHandling.throwsvsthrow;

import java.io.IOException;

public class MarriageRegistryService {

    public void register(Male male, Female female) throws UnderAgeException,SameSexMarriageException{
        checkMarriageEligibility(male, female);
        System.out.println("Registration service notification : Registered marriage successfully ");
    }


    public void checkMarriageEligibility(Male male, Female female) throws  UnderAgeException, SameSexMarriageException{
        checkUnderAge(male, female);
        checkSameSex(male, female);
    }

    public void checkSameSex(Human human1, Human human2) throws  SameSexMarriageException{

         if ( human1.getGender().equals(human2.getGender())){
             throw new SameSexMarriageException("Same sex marriage not allowed in India");
         }
    }



    public void checkUnderAge(Male male, Female female) throws  UnderAgeException {
        checkUnderAge(male);
        checkUnderAge(female);
    }


    private void checkUnderAge(Human human)   throws UnderAgeException  {


            if (human.getGender().equals("MALE")) {
                if (human.getAge() < 18) {
                    throw new UnderAgeException("Male should be of atleast 18 years old to get married.");
                }
            } else if (human.getGender().equals("FEMALE")) {
                if (human.getAge() < 21) {
                    throw new UnderAgeException("Female should be of atleast 21 years old to get married.");
                }
            }

    }
}
