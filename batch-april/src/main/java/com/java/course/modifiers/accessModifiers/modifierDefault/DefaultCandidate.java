package com.java.course.modifiers.accessModifiers.modifierDefault;

import lombok.AllArgsConstructor;


  class DefaultCandidate {

      String firstName;

      String lastName;

      DefaultCandidate(String firstName, String lastName, int salary) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.salary = salary;
    }

    int salary;



      String getFirstName() {
        return firstName;
    }

      String getLastName() {
        return lastName;
    }

      int getSalary() {
        return salary;
    }

      void setFirstName(String firstName) {
        this.firstName = firstName;
    }

      void setLastName(String lastName) {
        this.lastName = lastName;
    }

      void setSalary(int salary) {
        this.salary = salary;
    }
}
