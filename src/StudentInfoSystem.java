// Abstract base class
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

// Derived class for Student
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }
}

// Derived class for Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

// Main class
public class StudentInfoSystem {
    public static void main(String[] args) {
        // Creating objects
        Student student = new Student("Alice", 20, 101);
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        
        // Displaying details
        student.displayDetails();
        teacher.displayDetails();
    }
}