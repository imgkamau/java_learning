/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.strata.java_learning;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    //void - This method does not return anything.
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "George";
        String lastName = "WARUINGI";
        String middleName = "Kamau";
        System.out.println("My name is " + firstName + " " + middleName + " " + lastName);

        String fullName = firstName + " " + middleName + " " + lastName;
        //lower & upper
        System.out.println(fullName.toUpperCase());

        //length
        System.out.println(fullName.length());

        //special characters in Strings.
        //escaping of special xters in Java.
        String position = "C:\\Temenos";
        /*add an extra backslash*/
        System.out.println(position);

        String location = "C:\nTemenos";
        /*add n for new line*/
        System.out.println(location);

        String pos = "C:\tTemenos";
        /*add t for tab*/
        System.out.println(pos);
        //escaping double or single quotes.
        String loc = "C:\\\"Temenos\"";
        /*add t for tab*/
        System.out.println(loc);

        //CONDITIONAL PROCESSSING - SWITCH, TERNARY, IF ELSE
        int a = 10;
        int b = 12;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
        //TERNARY operator - if else shortform.
        String car = (a < b) ? "a is greater than b" : "a is less than b";
        System.out.println(car);

        if (a <= 5) {
            System.out.println("a is less or eq to 5");
        } else if (a > 5 && a <= 10) {
            System.out.println("a is greater than 5 but le 10");
        } else if (a > 10 && a <= 15) {
            System.out.println("a is greater than 10 but le 15");
        } else {
            System.out.println("a is gt 15");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other");
        }

        int days = 3;
        switch (days) {
            case 1 ->
                System.out.println("Sunday");
            case 2 ->
                System.out.println("Monday");
            case 3 ->
                System.out.println("Tue");
            case 4 ->
                System.out.println("Wed");
            default ->
                System.out.println("Other");
        }

        //FOR LOOP
        int number = 0;
        for (int i = 1; i < 11; i++) {
            number += i;
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
//while loop
        int size = 12;
        while (size > 5) {
            System.out.println("Size is greater than 5");
            size--;
        }

        //assignment = print 10 to 1 using for loop in line 105.
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

}
