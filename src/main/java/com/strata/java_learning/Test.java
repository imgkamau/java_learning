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
        /* String name = Test.getName(); calling a method with a return.
        System.out.println("Hello " + name);
         */
        String inputDate = "2022-04-09";
        String inputFormat = "yyyy-MM-dd";
        String outputFormat = "dd/MM/yyyy";
        //Utilities util = new Utilities(); //instantiating a non-static class - creating an object for that class.
        //String formattedDate = util.manipulateDateFormat(inputDate, inputFormat, outputFormat);
        String formattedDate = Utilities.manipulateDateFormat(inputDate, inputFormat, outputFormat);
        System.out.println("Formatted Date: " + formattedDate);
    }

    public static String getName() {
        String name = "George";
        return name;
    }
}
