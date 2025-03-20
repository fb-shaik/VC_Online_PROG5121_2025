
package joptionpane_demo;

import javax.swing.JOptionPane; //import statement
public class JOptionPane_Demo {
    
    public static void main(String[] args) {
        
        //String name = JOptionPane.showInputDialog("Enter your name: "); //get the input
        //JOptionPane.showMessageDialog(null, "Hello, " + name +"!" ); //display the output
        
        //String ageString = JOptionPane.showInputDialog("Enter your age:");  // Get user input as a String
        
        //convert String to numeric (int, double, float)
        //need to create a numeric variable & parse the String variable to allow for the conversion from string to numeric
        //int age = Integer.parseInt(ageString);
        
        //show to the user
       // JOptionPane.showMessageDialog(null, "Next year you will be " + (age + 1) + " years old ");
       
       
       // Get height as a String
        String heightString = JOptionPane.showInputDialog("Enter your height in meters:");
        
        //convert to double for decimal points
        double height = Double.parseDouble(heightString);
        
        // Display the result
        JOptionPane.showMessageDialog(null, "Your height is " + height + " meters.");
        
        
        
        
    }
    
}
/*
    JOptionPane is class in Java that will helps us create pop-up 
    dialog boxes (small windows) to interact with users.

    It is part of the javax.swing package, which is used for making Graphical User Interfaces (GUIs)
    We have import the package to our app



*/