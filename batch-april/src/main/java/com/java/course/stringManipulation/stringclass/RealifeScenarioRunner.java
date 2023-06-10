package com.java.course.stringManipulation.stringclass;

public class RealifeScenarioRunner {

    public static void main(String[] args){
        RealLifeScenario  scenarioRunner =  new RealLifeScenario();
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        scenarioRunner.putDataInDatabaseIfValuesAreDifferent( a, b);
    }
}
