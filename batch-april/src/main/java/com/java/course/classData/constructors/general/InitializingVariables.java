package com.java.course.classData.constructors.general;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;

public class InitializingVariables {

 

    @Value("${config}")
    private String filePath;

    public void recFiles(){
        File file = new File(filePath);
    }

    private int a;

    private  static int b;

    public InitializingVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "InitializingVariables{" +

                "a=" + a +
                ",b=" + b +
         '}';
    }





}
