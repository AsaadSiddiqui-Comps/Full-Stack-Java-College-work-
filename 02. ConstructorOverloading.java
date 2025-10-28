//Program to demonstrate constructor overloading in Java

// Concept
// Constructor Overloading → Multiple constructors in the same class with different parameter lists.
// Each constructor gives flexibility when creating objects:
// No info
// Only name
// Name + roll number
// Name + roll number + branch
// Constructors automatically run when an object is created — no need to call them directly.
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String branch;

    // Constructor 1: No parameters
    Student() {
        name = "Unknown";
        rollNo = 0;
        branch = "Not Assigned";
    }

    // Constructor 2: One parameter
    Student(String n) {
        name = n;
        rollNo = 0;
        branch = "Not Assigned";
    }

    // Constructor 3: Two parameters
    Student(String n, int r) {
        name = n;
        rollNo = r;
        branch = "Not Assigned";
    }

    // Constructor 4: Three parameters
    Student(String n, int r, String b) {
        name = n;
        rollNo = r;
        branch = b;
    }

    // Method to display details
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch : " + branch);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter You Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your RollNo.: ");
        int rollno = sc.nextInt();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        // Using different constructors
        Student s1 = new Student();
        Student s2 = new Student(name);
        Student s3 = new Student(name, rollno);
        Student s4 = new Student(name, rollno, branch);

        // Display details of each
        s1.display();
        s2.display();
        s3.display();
        s4.display();

        sc.close();
    }
}