// Abstract Class - Abstraction
abstract class Person {
    // Encapsulation: private fields
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters - Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Abstract Method - must be implemented by subclasses
    public abstract String getRole();

    // Display Info 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass - Inheritance
class Student extends Person {
    public Student(String name, int id) {
        super(name, id);  // calls the constructor of parent class Person
    }

    public String getRole() {
        return "Student";
    }
}

// Subclass - Inheritance
class Professor extends Person {
    public Professor(String name, int id) {
        super(name, id);
    }

    public String getRole() {
        return "Professor";
    }
}

// Main class to test
public class University {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Professor p = new Professor("Dr. Smith", 5001);

        // Display Student 
        s.displayInfo();
        System.out.println("Role: " + s.getRole());
        System.out.println();

        // Display Professor 
        p.displayInfo();
        System.out.println("Role: " + p.getRole());
    }
}
