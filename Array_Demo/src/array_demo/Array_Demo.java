
package array_demo;


public class Array_Demo {

  
    public static void main(String[] args) {
        //declare an array of numbers
        //datatype [] arrayName = {e1,e2,e3,e4,e5};
        
        
        //subscript          {0,   1,  2,  3,  4,  5 }
        int [] numbers = {10,23,45,17,19,12};
        //declared an array of size 6 via the populated elements
        //elements is what is held in the array (data in the array)
        //subscript(index): This is the position of the data element in the array 
        
     //use a for-loop to display the values populated in the array
     //declare a LCV to be used in the loop
     int index;
     // .lenght read the array size & keeps in bound 
     for(index = 0; index < numbers.length; index++)
         //index starts at subscript 0
         //moves index to the next position/subscript after every iteration until the condition no longer holds true
     {
         System.out.println(numbers[index] );//prints each element in a new line 
     } 
        System.out.println("Array elements in reverse");
     for (index = numbers.length - 1; index>=0; index--) 
     {
             System.out.println(numbers[index] );//prints each element in a new line
     }
     
        System.out.println("For-Each Loop");
        //For Each / Enhance For Loop
        //Used with array / collections without the need of an index
        /*Syntax: 
                for (datatype element : arrayName)
                    {
                        code block for the loop
                    }
        
            */
        
        for (int number : numbers )
        {
            System.out.println(number);  // prints each element in a new line
        }
        
     numbers[0] = 15; //accessing the element directly 
        System.out.println("Changed value at index 0 is: " + numbers[0]);
    }
    
}
