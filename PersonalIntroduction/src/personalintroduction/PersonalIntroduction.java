/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalintroduction;

/**
 *
 * @author FS
 */


// Program: Personal Introduction App
// Objective: Learn to declare and use different variable types in Java

public class PersonalIntroduction {
    public static void main(String[] args) {
        // Declare string variables
        String name = "John Doe";
        String favoriteColor = "Blue";
        String hobby = "Reading";

        // Declare integer variable
        int age = 22;

        // Declare char variable for gender (M = Male, F = Female)
        char gender = 'M';

        // Declare boolean variable to check if the person is a student
        boolean isStudent = true;

        // Print personal details
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("My favorite color is " + favoriteColor + ".");
        System.out.println("I enjoy " + hobby + " in my free time.");
        System.out.println("I am " + age + " years old.");
        System.out.println("Gender: " + gender);
        System.out.println("Currently a student: " + isStudent);
    }
}
