package com.java.course.exceptionalHandling.throwsvsthrow;

public class UnderAgeException extends Exception  {

    public UnderAgeException() {
        super();
    }

    public UnderAgeException(String errorMsg) {
        super(errorMsg);
    }
}
