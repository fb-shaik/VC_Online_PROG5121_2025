/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package favoritebook;

/**
 *
 * @author FS
 */

// Program: Favorite Book App
// Objective: Practice using string, integer, and floating-point variables

public class FavoriteBook {
    public static void main(String[] args) {
        // Declare string variables
        String title = "To Kill a Mockingbird";
        String author = "Harper Lee";
        String genre = "Fiction";

        // Declare integer variable for year published
        int yearPublished = 1960;

        // Declare float variable for book rating (out of 5)
        float bookRating = 4.8f;

        // Declare boolean variable for bestseller status
        boolean isBestseller = true;

        // Print book details
        System.out.println("Favorite Book");
        System.out.println("-------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Book Rating: " + bookRating);
        System.out.println("Was it a bestseller? " + isBestseller);
    }
}
