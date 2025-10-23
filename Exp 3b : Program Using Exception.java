// Exp 3b : Program Using Exception.java
//Name : Asaad Siddiqui

//Code

import java.util.Scanner; 
 
class WeakPasswordException extends Exception { 
    public WeakPasswordException(String message) { 
        super(message); 
    } 
} 
 
class PasswordChecker { 
    public static void check(String password) throws WeakPasswordException { 
        if (password.length() < 8) { 
            throw new WeakPasswordException("Password too short."); 
        } 
        if (!password.matches(".*[A-Z].*")) { 
            throw new WeakPasswordException("Password must contain an uppercase 
letter."); 
        } 
        if (!password.matches(".*[a-z].*")) { 
            throw new WeakPasswordException("Password must contain a lowercase 
letter."); 
        } 
        if (!password.matches(".*\\d.*")) { 
            throw new WeakPasswordException("Password must contain a number."); 
        } 
    } 
} 
public class exception { 
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


//output
// Case 1: 
// Enter password: Abc12 
// Weak password: Password too short. 
// Case 2: 
// Enter password: password123 
// Weak password: Password must contain an uppercase letter. 
// Case 3: 
// Enter password: PASSWORD123 
// Weak password: Password must contain a lowercase letter. 
// Case 4: 
// Enter password: Password 
// Weak password: Password must contain a number. 
// Case 5: 
// Enter password: Passw0rd 
// Password is strong.
