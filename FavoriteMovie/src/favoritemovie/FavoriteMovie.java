/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package favoritemovie;

/**
 *
 * @author FS
 */

// Program: Favorite Movie App
// Objective: Use string, integer, char, and boolean variables to display movie details

public class FavoriteMovie {
    public static void main(String[] args) {
        // Declare string variables
        String movieTitle = "Inception";
        String director = "Christopher Nolan";
        String genre = "Science Fiction";

        // Declare integer variable for the release year
        int releaseYear = 2010;

        // Declare double variable for IMDb rating
        double imdbRating = 8.8;

        // Declare char variable for the movie rating (e.g., PG-13, R)
        char movieRating = 'P';

        // Declare boolean to indicate if it was a blockbuster hit
        boolean isBlockbuster = true;

        // Print movie details
        System.out.println("Favorite Movie Details");
        System.out.println("----------------------");
        System.out.println("Title: " + movieTitle);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Genre: " + genre);
        System.out.println("IMDb Rating: " + imdbRating);
        System.out.println("Movie Rating: " + movieRating);
        System.out.println("Was it a blockbuster? " + isBlockbuster);
    }
}
