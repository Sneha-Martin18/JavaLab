import java.util.Scanner; // Scanner is used to input values, it is imported from java.util package.
public class SumOft
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Enter the first number : ");
            int num1 = scanner.nextInt();    // scanner.nextInt() waits for the user to input an integer.

            System.out.println("Enter the second number :");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of two numbers : " +sum);
        }
    }
}

