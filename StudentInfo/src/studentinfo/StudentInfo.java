package studentinfo;

/**
 *
 * @author FS
 */

// Program: Simple Student Information App
// Objective: Store and display student-related details with multiple data types

public class StudentInfo {
    public static void main(String[] args) {
        // Declare string variables
        String studentName = "Michael Brown";
        String course = "Computer Science";
        String university = "XYZ University";

        // Declare integer variable for age
        int age = 20;

        // Declare double variable for GPA
        double GPA = 3.9;

        // Declare char variable for grade level (F = Freshman, S = Senior)
        char gradeLevel = 'S';

        // Declare boolean variable for full-time status
        boolean isFullTime = true;

        // Print student details
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println("Current GPA: " + GPA);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Full-Time Student? " + isFullTime);
    }
}
