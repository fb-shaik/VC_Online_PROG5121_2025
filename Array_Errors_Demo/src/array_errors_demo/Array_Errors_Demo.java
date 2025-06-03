
package array_errors_demo;


public class Array_Errors_Demo {

    public static void main(String[] args) {
       int [] numbers = {10,20,30}; //array of size 3; index starts from 0 up until 2
        System.out.println(numbers[3]); // out of bounds error
        
       
       //Accessing or using an array element before it’s initialized
        String[] names = new String[3];
        System.out.println(names[0].length()); //NullPointerException
        
        //Uninitialized Arrays
        int[] scores;
        scores = new int[5];
        
      
}
        
        
        
    }
    

