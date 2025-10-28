//program using class and objects in java

import java.util.Scanner;
class Student {
    // Fields (attributes)
    String name;
    int rollNo;
    String branch;

    // Method to display student details
    void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch : " + branch);
    }

}

// Main class to test Student class
public class ClassObject {
    public static void main(String[] args) {
        // Create an object of Student
        Student s1 = new Student();

        // Assign values to the object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        s1.name = input.nextLine();
        System.out.print("Enter roll number: ");
        s1.rollNo = input.nextInt();
        input.nextLine();
        System.out.print("Enter branch: ");
        s1.branch = input.nextLine();

        // Call methods
        s1.displayDetails();
        input.close();
    }
}