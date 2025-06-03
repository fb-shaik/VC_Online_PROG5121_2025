
package parallel_array_flag_demo;

import java.util.Scanner;


public class Parallel_Array_Flag_Demo {

    public static void main(String[] args) {
        //1D Array: dataType [] ArrayName = {e1,e2,e3,....};
        //Parallel arrays are two or more arrays where the elements at the same index are logically related.
        
        //Define the two arrays (product & prices)
         String [] products = {"Laptop", "Smartphone", "Tablet", "Keyboard", "Monitor"};
//subscript for each array {    0,             1,                    2,               3,                 4        }  
         double [] prices =    {999.99,      650.50,             500,           200,              150    };
        
         //Create a scanner object to receive the user input
        Scanner scanner = new Scanner(System.in);
        
         //Prompt the user for the product they wish to search for
         System.out.println("Enter a product name to search: ");
         String searchProduct = scanner.nextLine(); //store & hold the name of the product to search for
         
          //Search for the product in the 'products' array using a flag variable
        boolean found = false;
          //Create a varible (foundIndex) initialized to -1 to store the index of the found product 
        int foundIndex = -1; 
        
        //Loop to search through the product array to check if the user input is there 
        for(int i = 0; i <products.length; i++)
        {
            if(products[i].equalsIgnoreCase(searchProduct))
                {
                    found = true;
                    foundIndex = i ; //now set the foundIndex to the product search result
                    break;
                }
        }
        if(found) 
            {//If the product has been found, get the corresponding price from the prices array
                 System.out.println(searchProduct + " costs R: " + prices[foundIndex]);
            } else
                {
                    //if the product was not found in the products array, inform the user
                    System.out.println(searchProduct + " not found in the product listing");
                }
        scanner.close();
        
        
    }
    
}
