package com.java.course.classData.constructors.contructorChaining;

public class B extends A{



    public B() {
        System.out.println("Mammal-Constructor");
    }

    public B(int val){
        System.out.println("B()-with value : "  + val);
    }



    public void m2(){
        System.out.println("Animal-m2");
    }
}
