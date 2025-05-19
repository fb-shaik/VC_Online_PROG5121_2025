/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessinggameapp;

import javax.swing.JOptionPane;

public class GuessingGameApp {

    public static void main(String[] args) {
       // Create a new game object
        GuessGame game = new GuessGame();

        // Start the game
        game.play();

        // Show the result message
        JOptionPane.showMessageDialog(null, game.getResult());
    }
}
