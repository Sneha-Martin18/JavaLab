import java.util.Scanner;
public class Swapt 
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter the first number : ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number : ");
            int num2 = scanner.nextInt();

            int temp;

            System.out.println("First Number :" +num1);
            System.out.println("Second number :" +num2);

            temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("_____After swapping___");
            
            System.out.println("First Number :" +num1);
            System.out.println("Second number :" +num2);
            

        }
    }
}