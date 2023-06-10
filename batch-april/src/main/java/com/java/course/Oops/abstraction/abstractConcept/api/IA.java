package com.java.course.Oops.abstraction.abstractConcept.api;

public interface IA {

    public abstract  void m1();


}


/*


Animal -> Mammal --> Dog  {speak : bark}

                 --> Cat {speak : meow}

                 public static void main(String[] args){
                  Animal animal = new Dog();
                  speak(animal);

                  Animal animal = new Cat();
                  }

                 public void speak(Animal animal){
                 animal.speak();
                 }



                 public class Dog extends Mammal{

                   public void speak(){
                   System.out.println("bark");
                   }

                 }

                 public class Cat extends Mammal{

                   public void speak(){
                   System.out.println("Meow");
                   }

                 }


                 public abstract class Mammal implements Animal{

                 }

                 public interface Animal {
                     public abstract void speak();
                 }
 */