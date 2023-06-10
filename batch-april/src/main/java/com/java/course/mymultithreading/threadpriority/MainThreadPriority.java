package com.java.course.mymultithreading.threadpriority;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

public class MainThreadPriority extends  Object {

    public  static void main(String[] args) {

        System.out.println("Name of thread : " + Thread.currentThread().getName());
        System.out.println("Priority of thread : " + Thread.currentThread().getPriority());


    }
}
