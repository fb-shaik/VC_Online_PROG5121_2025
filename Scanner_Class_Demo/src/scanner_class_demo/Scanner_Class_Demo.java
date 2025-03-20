
package scanner_class_demo;

import java.util.Scanner; //Step 1: Import Statement

public class Scanner_Class_Demo {

    public static void main(String[] args) {
        //Step 2: create a Scanner object
        //Syntax: ClassName objectName = new ClassName(System.in);
        Scanner input = new Scanner(System.in);
        
        //Step 3: Ask the user for input
        System.out.println("Enter your name: ");
        String name = input.nextLine(); //allow for the app to read/capture the keyboard strokes
        
        System.out.println("Enter your age: ");
        int age = input.nextInt(); //read input that is numeric (integer datatype)
        
        System.out.println("Enter the price: ");
        double price = input.nextDouble(); //read input that fits for a double datatype
        
        //Step 4: Display the output
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("The price of the item is: $ " + price);
        
        //Step 5: close of the Scanner object once we are done
        //Syntax: objectName.close();
        input.close();
}
}
