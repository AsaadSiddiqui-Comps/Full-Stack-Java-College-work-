//program to demostrate all types of inheritance in java
//Concept:
// Inheritance → Mechanism where one class acquires properties (fields and methods) of another
// | Type                         | Example                                      | Description                        |
// | ---------------------------- | -------------------------------------------- | ---------------------------------- |
// | **Single Inheritance**       | `Student extends Person`                     | One class inherits another         |
// | **Multilevel Inheritance**   | `CollegeStudent extends Student`             | Chain of inheritance               |
// | **Hierarchical Inheritance** | `Student` and `Teacher` both extend `Person` | One parent, multiple children      |
// | **User Input**               | `Scanner` class                              | Taking values from user at runtime |



import java.util.Scanner;

// Parent class (Base)
class Person {
    String name;
    int age;

    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// Single Inheritance: Student inherits from Person
class Student extends Person {
    int rollNo;

    void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

// Multilevel Inheritance: CollegeStudent inherits from Student
class CollegeStudent extends Student {
    String branch;

    void inputBranch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Branch: ");
        sc.nextLine(); // clear buffer
        branch = sc.nextLine();
    }

    void displayBranch() {
        System.out.println("Branch : " + branch);
    }
}

// Hierarchical Inheritance: Teacher also inherits Person
class Teacher extends Person {
    String subject;

    void inputTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    void displayTeacher() {
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose what to enter:");
        System.out.println("1. Student Details");
        System.out.println("2. College Student Details");
        System.out.println("3. Teacher Details");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {
            case 1:
                Student s = new Student();
                s.inputPerson();
                s.inputStudent();
                System.out.println("\n--- Student Details ---");
                s.displayPerson();
                s.displayStudent();
                break;

            case 2:
                CollegeStudent cs = new CollegeStudent();
                cs.inputPerson();
                cs.inputStudent();
                cs.inputBranch();
                System.out.println("\n--- College Student Details ---");
                cs.displayPerson();
                cs.displayStudent();
                cs.displayBranch();
                break;

            case 3:
                Teacher t = new Teacher();
                t.inputPerson();
                t.inputTeacher();
                System.out.println("\n--- Teacher Details ---");
                t.displayPerson();
                t.displayTeacher();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
