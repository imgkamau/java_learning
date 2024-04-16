/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_files;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Java_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ARRAYS 
        // TODO code application logic here
        //an array can be any data type. - called collections in Java.
        String[] cars = {"Volvo", "BMW", "Tesla", "Mobius"};
        int[] ages = {12, 13, 14, 15};
        System.out.println(cars[1]);
        //replace item in array using the index.
        cars[1] = "Toyota";
        System.out.println(cars[2]);

        //length - number of items in the array.
        System.out.println(cars.length);

        //looping through arrays.
        for (String x : cars) {
            System.out.println(x);
        }

        for (int x = 0; x < cars.length; x++) {
            System.out.println(cars[x]);
        }

        //multidimensional arrays.
        //matrix - a table.
        int[][] age = {{12, 13, 14, 15}, {16, 17, 18, 19}};
        /*
        {
{12, 13, 14, 15},
{16, 17, 18, 19}
}
17 = row 2 column 2

age[1][1]
         
        //System.out.println(age[1][1]);
         */
        //System.out.println(age[0]);

        for (int i = 0; i < age.length; i++) {
            System.out.println(Arrays.toString(age[i]));
            for (int j = 0; j < age[i].length; j++) {
                //System.out.println(age[i][j]);
            }
            // System.out.println(Arrays.toString(age[i]));
        }

        //Convert string to array.       
        String mystring = "Hello my name is George";
        String[] stringparts = mystring.split(" ");
        System.out.println(stringparts[0]);

        String animals = "My cows are grazing!";
        String animals_replaced = animals.replace("!", ".");
        System.out.println(animals_replaced);

        String mysal = "12,000";

        System.out.println(mysal.replace(",", ""));

        //String mysal_repl = mysal.replace(",", "");
        //System.out.println(mysal_repl);
        //replaceall - research on this.
        String name = "Chat";
        String anim = "chat";
        if (name.equals(anim)) {
            System.out.println("THe 2 strings are equal");
        } else {
            System.out.println("THe 2 strings are not equal");
        }

        if (name.equalsIgnoreCase(anim)) {
            System.out.println("THe 2 strings are equal");
        } else {
            System.out.println("THe 2 strings are not equal");
        }

        //contains method.
        if (mystring.contains("my")) {
            System.out.println("THe string contains my");
        } else {
            System.out.println("THe string doesn't contains my");
        }

        if (mystring.toLowerCase().contains("george")) {
            System.out.println("THe string contains my");
        } else {
            System.out.println("THe string doesn't contains my");
        }

        //charAt - character at a given index of your string.
        System.out.println(name.charAt(0));

        //
        String acct = "100162978100101";
        String acctype = acct.substring(6, 9);
        if (acctype.equals("978")) {
            System.out.println(acctype);
            System.out.println("This is an EUR acct");
        }

        //startsWith() endsWith()
        if (acct.startsWith("100")) {
            System.out.println("This is a Customer Acct");
        }
        
        //Trim()- remove whitespace at the beginning or end of a string.
        String myname = "   GeorgeWaruingi   ";
        System.out.println(myname.trim());
        

    }

}
