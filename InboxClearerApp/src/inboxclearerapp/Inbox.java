/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inboxclearerapp;

// Inbox class simulates an inbox with unread emails

import javax.swing.JOptionPane;

   class Inbox {
        // Private variable to store the number of unread emails
        private int unreadEmails;

        /**
         * Constructor to set the initial number of unread emails.
         *
         * @param initialCount The starting number of unread emails
         */
        public Inbox(int initialCount) {
            unreadEmails = initialCount;
        }

        /**
         * This method simulates clearing emails one at a time using a while loop.
         * It shows the user how many emails are left after each one is "cleared".
         */
        public void clearInbox() {
            // Continue looping until there are no unread emails left
            while (unreadEmails > 0) {
                // Display the current number of unread emails
                JOptionPane.showMessageDialog(null, "Unread Emails: " + unreadEmails);

                // Simulate clearing one email
                unreadEmails--;
            }
        }

        /**
         * Returns a message indicating that the inbox is empty.
         *
         * @return Status message
         */
        public String getStatus() {
            return "Inbox Zero!";
        }
    }