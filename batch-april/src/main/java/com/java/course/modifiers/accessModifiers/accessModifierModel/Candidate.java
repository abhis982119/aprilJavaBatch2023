package com.java.course.modifiers.accessModifiers.accessModifierModel;

import lombok.AllArgsConstructor;


  public class Candidate {

        public Candidate(String firstName, String lastName, int salary) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.salary = salary;
      }

      public String firstName;

    public String lastName;

    public int salary;



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
