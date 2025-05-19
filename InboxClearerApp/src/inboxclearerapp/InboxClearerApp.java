/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inboxclearerapp;

import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class InboxClearerApp {

   public static void main(String[] args) {
        // Ask the user how many unread emails they have
        String input = JOptionPane.showInputDialog("Enter the number of unread emails:");

        // Convert the input string to an integer
        int startingEmails = Integer.parseInt(input);  // Assumes valid numeric input

        // Create an Inbox object with the initial email count
        Inbox myInbox = new Inbox(startingEmails);

        // Simulate clearing the inbox
        myInbox.clearInbox();

        // Show final status message
        JOptionPane.showMessageDialog(null, myInbox.getStatus());
    }
}