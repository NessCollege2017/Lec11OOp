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
     Student(String firstName, String lastName, String socialID, String phone, String email, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
    }
    //Empty constructor
    Student(){
        this.firstName = IO.getString("Enter your Name:");
        this.lastName = IO.getString("Enter your last Name:");
        this.socialID = IO.getString("Enter Social ID:");
        this.phone = IO.getString("Enter Phone:");
        this.email = IO.getString("Enter Email:");
        this.address = IO.getString("Enter Address");
        this.age = IO.getInt("Enter age:");
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
