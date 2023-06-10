package com.java.course.classData.constructors.general;

public class BasicConstructor  {

    byte b;
    short s;

    int i ;
    long l;

    float f;
    double d;


    @Override
    public String toString() {
        return "BasicConstructor{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                '}';
    }
    public BasicConstructor( ) {

    }



    public BasicConstructor(byte b) {
        this.b = b;
    }

    public BasicConstructor(short s) {
        this.s = s;
    }

    public BasicConstructor(int i) {
        this.i = i;
    }

    public BasicConstructor(long l) {
        this.l = l;
    }

    public BasicConstructor(float f) {
        this.f = f;
    }

    public BasicConstructor(double d) {
        this.d = d;
    }
}
