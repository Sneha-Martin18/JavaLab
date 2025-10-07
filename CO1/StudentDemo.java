class Student {
    String name;
    int marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student();

        // Set properties
        s1.name = "Sneha";
        s1.marks = 92;

        // Display details
        s1.displayDetails();
    }
}
