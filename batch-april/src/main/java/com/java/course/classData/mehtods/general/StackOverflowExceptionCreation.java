package com.java.course.classData.mehtods.general;

public class StackOverflowExceptionCreation {

    void m1()
    { System.out.println("m1");
        m2();
    }
    void m2()
    { System.out.println("m2");
        m1();
    }
    public static void main(String[] args)
    { StackOverflowExceptionCreation t=new StackOverflowExceptionCreation();
        t.m1();
    }
}
