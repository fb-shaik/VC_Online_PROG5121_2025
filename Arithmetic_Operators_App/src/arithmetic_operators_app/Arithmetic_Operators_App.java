package arithmetic_operators_app;

public class Arithmetic_Operators_App {

    public static void main(String[] args) {
        //declare two variables to hold values to use with the arthimetic operators
        
        //Syntax: dataType VariableName = initailValue;
        double num1 = 12.5;
        double num2 = 4;
        double result; 
        
        //Perform a calculation for each of the operators
        result = num1 + num2;
        System.out.println("Addition of num1 & num2: " + result);
        
        result = num1 - num2;
        System.out.println("Subtraction of num1 & num2: " + result);
        
        result = num1 * num2;
        System.out.println("Multiplication of num1 & num2: " + result);
        
        result = num1 / num2;
        System.out.println("Division of num1 & num2: " + result);
        
        result = num1 % num2; 
        System.out.println("Remainder of num1 & num2: " + result);
        
        result = (num1 + num2) * 2; //brackets are calculated first, after that the result of the addition is multiplied 
        System.out.println("Bracketed Calculation is: " + result);
    }
    
}
