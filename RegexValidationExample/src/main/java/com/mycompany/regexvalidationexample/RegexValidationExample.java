

package com.mycompany.regexvalidationexample;

import javax.swing.JOptionPane;

public class RegexValidationExample {

    public static void main(String[] args) {
         String email = JOptionPane.showInputDialog("Enter your email:");
         
         //regex pattern
         //hello-prog@gmail.com
         //hello.prog@gmail.com
         String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

         
         if(email.matches(emailPattern))
         {
            JOptionPane.showMessageDialog(null, "Valid email address!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid email format.");
        }
             
    }
}
