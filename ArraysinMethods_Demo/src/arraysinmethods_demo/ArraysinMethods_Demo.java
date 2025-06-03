
package arraysinmethods_demo;

public class ArraysinMethods_Demo {

    //app stores a list of student scores, 
    //calculates the average, and returns a new array of only the scores that are above average
    public static void main(String[] args) {
        
        // Define an array of student scores
        int[] scores = {75, 88, 92, 60, 70, 85, 90};
        
        // Call a method to calculate the average
        double avg = calculateAverage(scores); //when an array is passed as an argument, no need for []
        System.out.println("Average score: " + avg);
        
        // Call a method to get scores above average
        int[] aboveAvgScores = getAboveAverage(scores, avg);
        
         // Display scores above average
        System.out.println("Scores above average:");
        displayArray(aboveAvgScores);
      
    }
    
        // Method to calculate average of an array
    public static double calculateAverage(int [] arr)
    {
        int sum = 0;
        for (int score : arr)
        {
            sum += score;
        }
        return (double) sum / arr.length;
    }
    
    // Method to return an array of values above average
    public static int [] getAboveAverage(int [] arr, double avg)
    {
         // First count how many scores are above average
        int count = 0;
        for (int score : arr) {
            if (score > avg) {
                count++;
            }
        }
          // Create a new array to hold those scores
        int[] result = new int[count];
        int index = 0;
        for (int score : arr) {
            if (score > avg) {
                result[index++] = score;
            }
        }
        return result;
    }
    
    // Method to display an array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    
}
