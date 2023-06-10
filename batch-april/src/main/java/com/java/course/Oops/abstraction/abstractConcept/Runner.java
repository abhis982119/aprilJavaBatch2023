package com.java.course.Oops.abstraction.abstractConcept;

import com.java.course.Oops.abstraction.abstractConcept.api.Animal;
import com.java.course.Oops.abstraction.abstractConcept.impl.*;

import java.util.Arrays;

public class Runner {


    public static void main(String[] args){
     /*     Animal dog = new Dog();
          AnimalTrainer.makeSpeak(dog);


          Animal cat = new Cat();
          AnimalTrainer.makeSpeak(cat);


          Animal human = new Human();
          AnimalTrainer.makeSpeak(human);
          */


          int[] arr = new int[]{2,1,4,5};
          ArrayHelper.print(arr);
          Arrays.sort(arr);
          System.out.println("after sorting ");
          ArrayHelper.print(arr);


    }


}
