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
        String name = Test.getName();
        System.out.println("Hello " + name);
    }

    public static String getName(){
        String name = "George";
        return name;
    }
}
