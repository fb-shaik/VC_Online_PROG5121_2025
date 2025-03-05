package variables_constants;

//App demo of the use of variables & constants
/*
    This is how we indicate a block comment
*/
public class Variables_Constants {

    public static void main(String[] args) {
        
        //declaring a set of constants (unchanged values)
        //Syntax: final dataType CONSTANT_NAME = fixedValue;
        final String APP_NAME = "Java Basics - Variables & Constants";
        final double PI = 3.14159;
        final double DISCOUNT_RATE = 0.10;
        
        //declaring a set of variables (modifiable values)
        //Syntax: dataType variableName; 
        //Syntax: dataType variableName = initialValue;
        String userName; 
        String firstName = "Alice";
        char userGrade ='A'; 
        int userAge; 
        int myNumber = 1000;
        double accountBalance = 1550.75;
        
        boolean isJavaFun = true;
        boolean isRaining = false; 
        boolean isNumeric; 
        
        //Print statement: An instruction that allows for the display/output of text to user
        //System.out.println()
        System.out.println("Printing Constants");
        System.out.println("Welcome to " + APP_NAME );
        System.out.println("Grade: " + userGrade);
        System.out.println("myNumber: " + myNumber);
        System.out.println("Account Balance: " + accountBalance);
         System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is it raining? " + isRaining);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
