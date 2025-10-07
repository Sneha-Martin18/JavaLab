import java.util.Scanner;
public class Grade
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the Mark :");
            int mark = sc.nextInt();

            if (mark >= 90)
            {
                System.out.println("Mark : "+mark+ " Grade : A+");
            }
            else if (mark >= 80 && mark < 90)
            {
                System.out.println("Mark : "+mark+ " Grade : A");
            }
            else if (mark >= 70 && mark < 80)
            {
                System.out.println("Mark : "+mark+ " Grade : B+");
            }
            else if (mark >= 60 && mark < 70)
            {
                System.out.println("Mark : "+mark+ " Grade : B");
            }
            else if (mark >= 50 && mark < 60)
            {
                System.out.println("Mark : "+mark+ " Grade : C+");
            }
            else
            {
                System.out.println("Failed!");
            }
            
        }
    }
}