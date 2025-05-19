

package com.mycompany.switchcase_demo;

import javax.swing.JOptionPane;


public class SwitchCase_Demo {

    public static void main(String[] args) {
         // Ask the user to enter a menu choice
        String choice = JOptionPane.showInputDialog("Enter a choice: Login, Signup, Exit");
        
         // Use switch to handle the choice (case-insensitive)
         switch ( choice.toLowerCase())
         {
             case "login" :
                    JOptionPane.showMessageDialog(null, "Logging in...");
                    break; //exit the choice that was made
            case "signup":
                JOptionPane.showMessageDialog(null, "Signing up...");
                break;
             case "exit":
                JOptionPane.showMessageDialog(null, "Exiting...");
                break;  
             default:
                JOptionPane.showMessageDialog(null, "Unknown option."); 
         }
        
    }
}
