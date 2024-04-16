/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.strata.java_advanced;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Data_Types. - primitive(original) & non primitive.
        //short int long
        String userName = args[0];
        String passWord = args[1];
        System.out.println("The username is " + userName + " and the passowrd is " + passWord);
        
        short x = 5;
        System.out.println("The value is " + x);
        /*
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         */
        short xx = 32764;
        System.out.println("The value is " + xx);

        //float && double.
        float floatNum = 1.23456789f; // Notice the 'f' suffix to indicate it's a float
        double doubleNum = 1.23456789; //can be terminated with 'd' but that's optional.
        System.out.println("It is " + floatNum);

        char a = 'a'; //only takes one character.

        boolean l = true; //only returns true or false.

        //scientific numbers.
        double largeNumber = 1.23e6; // Equivalent to 1.23 * 10^6
        double smallNumber = 5.67e-3; // Equivalent to 5.67 * 10^(-3)
        
        System.out.println(largeNumber);
        System.out.println(smallNumber);
        
        //casting-change variable from 1 data type to another.
        int k = 450;
        double j = k;
        double xl = 340.78;
        int lx = (int) xl;
        System.out.println(j);
        System.out.println(lx);
    }

}
