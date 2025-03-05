/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package favoritemusicartist;

/**
 *
 * @author FS
 */

// Program: Favorite Music Artist App
// Objective: Store and display details of a favorite music artist

public class FavoriteMusicArtist {
    public static void main(String[] args) {
        // Declare string variables
        String artistName = "Taylor Swift";
        String genre = "Pop";
        String hitSong = "Shake It Off";

        // Declare integer variable for debut year
        int debutYear = 2006;

        // Declare float variable for album sales (in millions)
        float albumSales = 80.5f;

        // Declare boolean variable for Grammy Award status
        boolean hasWonGrammy = true;

        // Print artist details
        System.out.println("Favorite Music Artist");
        System.out.println("---------------------");
        System.out.println("Artist Name: " + artistName);
        System.out.println("Genre: " + genre);
        System.out.println("Famous Song: " + hitSong);
        System.out.println("Debut Year: " + debutYear);
        System.out.println("Album Sales: " + albumSales + " million");
        System.out.println("Has won a Grammy? " + hasWonGrammy);
    }
}
