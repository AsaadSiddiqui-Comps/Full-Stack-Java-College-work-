//program to demonstrate checked and unchecked exceptions in Java

import java.util.Scanner;

// Custom Exception class
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message); // Call parent (Exception) constructor with message
    }
}

// Password checking class
class PasswordChecker {
    public static void check(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password too short.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("Password must contain an uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new WeakPasswordException("Password must contain a lowercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must contain a number.");
        }
    }
}

// Main class
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scan.nextLine();

        try {
            PasswordChecker.check(password);
            System.out.println("Password is strong.");
        } catch (WeakPasswordException e) {
            System.out.println("Weak password: " + e.getMessage());
        }

        scan.close();
    }
}