
package methods_demo;

public class Methods_Demo {

     //Method Signature: accessSpecifier static/non-static dataReturnType MethodName()
    
    
    public static void main(String[] args) {
        //method call (invoke a method)
        //you are calling the set of code contained in the method
        //Syntax: methodName();
        displayAddress(); //no argument & returns no value method
        displayAddress();
        displayAddress();
        displayAddress();
        displayAddress();
        displayAddress();
        displayAddress();
        displayAddress();
        
        
    }
    
     //Method Signature: accessSpecifier static/non-static dataReturnType MethodName()
    public static void displayAddress()
    {//method body - block of code to execute sits here
        System.out.println("ABC TECH-WORLD");
        System.out.println("123 Happy Place");
        System.out.println("Lego World");
        System.out.println("\n-------------------------------------------\n");
        //no return keyword for this method because of the void keyword in the method signature
    }
}

