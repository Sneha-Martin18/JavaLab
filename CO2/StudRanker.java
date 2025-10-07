import java.util.Scanner;
class Student
{
    String name;  //local variables
    int mark;

    // constructor 1 // constructors:instance vaiables
    Student()
    {
        this.name = "Sophia Mathew";
        this.mark = 98;

    }

    //constructor 2
    Student(int x)
    {
        this.name = "Stephen Jacob";
        this.mark= x;
  

    }
    //constructor 3
    // Student( String n, int x)
    // {
    //     this.name = n;
    //     this.mark = x;
    //     System.out.println("Name:" +name+ "Mark:" +mark);
    // }
    //constructor 4 taking input from user
    Student( String n, int x)
    {
        this.name = n;
        this.mark = x;
    
    }

    String Grade()
{
    if (mark >= 90){ return "S";}
    else if (mark >= 80 && mark <90){return "A";}
    else if (mark >= 70 && mark <80){return "B";}
    else if (mark >= 60 && mark <70){return "C";}
    else if (mark >= 50 && mark <60){return "D";}
    else {return "F";}


}

    void displayResult() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Marks: " + this.mark);
        System.out.println("Grade: " + Grade());
    }

}


public class StudRanker
{
    public static void main(String[] args)
    {
    Student s1 = new Student();
    Student s2 = new Student(89);
    // Student s3 = new Student("Stanley Thomas",93);
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name = in.nextLine();
    System.out.println("Enter the mark :");
    int mark = in.nextInt();
    Student s4 = new Student(name,mark);
    s1.displayResult();
    System.out.println();
    s2.displayResult();
    System.out.println();
    s4.displayResult();
    System.out.println();

    }

}