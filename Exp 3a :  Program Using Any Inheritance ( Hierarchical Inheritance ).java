// Exp 3a :  Program Using Any Inheritance ( Hierarchical Inheritance ).java
// Name : Asaad Siddiqui

//code
class User { 
    String name; 
    int year; 
    String ID; 
 
    User(String name, int year, String ID) { 
        this.name = name; 
        this.year = year; 
        this.ID = ID; 
    } 
} 
 
class Teacher extends User { 
    String subject; 
 
    Teacher(String name, int year, String ID, String subject) { 
        super(name, year, ID); 
        this.subject = subject; 
    } 
 
    void viewTeacher() { 
        System.out.println("Teacher Details - Name: " + name + ", year: " + year + ", 
ID: " + ID + ", Subject: " + subject); 
    } 
} 
 
class Student extends User { 
    String yearType; 
 
    Student(String name, int year, String ID, String yearType) { 
        super(name, year, ID); 
        this.yearType = yearType; 
    } 
 
    void viewStudent() { 
        System.out.println("Student Details - Name: " + name + ", year: " + year + ", 
ID: " + ID + ", " + yearType + " student"); 
    } 
}
 
public class exp { 
    public static void main(String[] args) { 
        Teacher teacher = new Teacher("Mohammed Zubair", 30, "M365", "Mathematics"); 
        Student student1 = new Student("Asaad", 2, "241258", "2nd year"); 
        Student student2 = new Student("Student2", 1, "2412259", "1st year"); 
 
        teacher.viewTeacher(); 
        student1.viewStudent(); 
        student2.viewStudent(); 
    } 
}

// Output
// Teacher Details - Name: Mohammed Zubair, year: 30, ID: M365, Subject: Mathematics 
// Student Details - Name: Asaad, year: 2, ID: 241258, 2nd year student     
// Student Details - Name: Student2, year: 1, ID: 2412259, 1st year student
