/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggameapp;

import javax.swing.JOptionPane;
import java.util.Random;

 // GuessGame class encapsulates the game logic
    class GuessGame {
        private int secretNumber;         // The random number to be guessed
        private boolean guessedCorrectly; // Flag to track if the user guessed correctly

        /**
         * Constructor generates a random secret number between 1 and 5.
         */
        public GuessGame() {
            Random rand = new Random();
            secretNumber = rand.nextInt(5) + 1;  // Generates a number from 1 to 5
            guessedCorrectly = false;
        }

        /**
         * Handles the gameplay. The user has a maximum of 3 attempts to guess the number.
         * Uses a while loop to control attempts and decision logic to check correctness.
         */
        public void play() {
            int attempts = 0;

            // Loop until user has made 3 guesses or guessed correctly
            while (attempts < 3 && !guessedCorrectly) {
                // Prompt user for a guess
                String input = JOptionPane.showInputDialog("Guess a number between 1 and 5 (Attempt " + (attempts + 1) + "):");

                // Convert the input to an integer (assumes valid input)
                int guess = Integer.parseInt(input);

                // Check if guess is correct
                if (guess == secretNumber) {
                    guessedCorrectly = true; // Set the flag to true
                }

                // Increment the number of attempts
                attempts++;
            }
        }

        /**
         * Returns the final result message after the game ends.
         *
         * @return Win or lose message based on the guessedCorrectly flag.
         */
        public String getResult() {
            if (guessedCorrectly) {
                return "Congratulations! You guessed the number!";
            } else {
                return "Sorry! The correct number was " + secretNumber + ". Better luck next time!";
            }
        }
    }
