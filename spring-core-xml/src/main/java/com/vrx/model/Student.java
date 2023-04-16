package com.vrx.model;

public class Student {

    private int rollNumber;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int rollNumber, String firstName, String lastName, String email) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }
}
