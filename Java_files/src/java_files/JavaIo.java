/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaIo {

    public static void readFiles() {
        try {
            File inputFile = new File("C:\\Users\\Admin\\Desktop\\restaurant_data.csv");
            Scanner scanner = new Scanner(inputFile);
            FileWriter outputFileWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\students.csv");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    System.out.println(line);
                    outputFileWriter.write(line + "\n"); // Write the line to the output file
                }
            }
            // Close the resources
            outputFileWriter.close();
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void readPropertiesFile(String fileName) {
        Properties prop = new Properties();
        try {
         InputStream is = new FileInputStream(fileName);
         prop.load(is);
         String db_url = prop.getProperty("database.url");
         String db_user = prop.getProperty("database.username");
         String db_pw = prop.getProperty("database.password");
         
            System.out.println(db_url);
            System.out.println(db_user);
            System.out.println(db_pw);
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void traverseDirectory(File directory) {
        // Get list of files and directories inside the given directory
        File[] files = directory.listFiles();

        if (files != null) {
            // Loop through each file or directory
            for (File file : files) {
                // If it's a directory, recursively traverse it
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    traverseDirectory(file);
                } else {
                    // If it's a file, just print its name
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }

}
