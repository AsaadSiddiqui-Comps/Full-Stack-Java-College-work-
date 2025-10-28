//program to demostrate method overloading in java

// Concept:
// Method Overloading → Same method name, different parameter lists.
// The compiler chooses which version to call based on:
// Number of parameters
// Type of parameters
// This happens at compile-time → that’s why it’s called compile-time polymorphism.

import java.util.Scanner;

// File: MethodOverloadingExample.java

class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (same method name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        // Create Calculator object
        Calculator calc = new Calculator();

        // Call overloaded methods
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First integer: ");
        int a = sc.nextInt();
        System.out.print("Enter Second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter Third integer: ");
        int c = sc.nextInt();
        
        System.out.println("Sum of 2 integers: " + calc.add(a, b));
        System.out.println("Sum of 3 integers: " + calc.add(a, b, c));
        double d1 = (double) a; // Using the first integer as double
        double d2 = (double) b; // Using the second integer as double
        System.out.println("Sum of 2 doubles: " + calc.add(d1, d2));

        sc.close();
    }
}

