/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temenos_learning;

import com.strata.java_learning.Utilities;

/**
 *
 * @author Admin
 */
public class Temenos_learning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputDate = "2022-04-09";
        String inputFormat = "yyyy-MM-dd";
        String outputFormat = "dd/MM/yyyy";

        
        //Utilities util = new Utilities(); //instantiating a non-static class - creating an object for that class.
        //String formattedDate = util.manipulateDateFormat(inputDate, inputFormat, outputFormat);
        String formattedDate = Utilities.manipulateDateFormat(inputDate, inputFormat, outputFormat);
        
        System.out.println("Formatted Date: " + formattedDate);
        
        int age = 22;
        String sex = "male";
        String firstName = "James";
        System.out.println(Temenos_learning.getDetails(age, sex));
        System.out.println(Temenos_learning.getDetails(age, sex, firstName));
    }

    //METHOD OVERLOADING - same method but signature(args) change.
    public static String getDetails(int age, String sex) {
        String output = "Your age is " + age + " and gender is " + sex;
        return output;
    }

    public static String getDetails(int age, String sex, String firstName) {
        String output = "Your age is " + age + " and gender is " + sex + " and first name is " + firstName;
        return output;
    }
}
