/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strata.java_learning1;

/**
 *
 * @author Admin
 */
public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

   /* public static void main(String[] args) {
        // Creating an instance of Person class
        Person person1 = new Person("Alice", 30);

        // Calling introduce method
        person1.introduce();

        // Changing name using setter
        person1.setName("Bob");

        // Changing age using setter
        person1.setAge(25);

        // Calling introduce method again
        person1.introduce();
    }*/
}

