package edu.tomer.java;

/**
 * This is a template, that describes
 * What is a Student?
 * What properties?
 * What Actions?/ Methods? students have?
 */

public class Student {
    //properties: variables:
    String firstName;
    String lastName;
    String socialID;
    String phone;
    String email;
    String address;
    int age; //Date

    //Constructor
    public Student(String firstName, String lastName, String socialID, String phone, String email, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
    }
    void sayYourName(){
        System.out.println(firstName + " " + lastName);
    }

    void grow(int years){
        age =  age + years;
    }

    int whatsYourAge(){
        return age;
    }
}
