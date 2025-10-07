import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice (+, -, *, /):");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+': {
                int sum = num1 + num2;
                System.out.println("Sum of two numbers: " + sum);
                break;
            }

            case '-': {
                int diff = num1 - num2;
                System.out.println("Difference of two numbers: " + diff);
                break;
            }

            case '*': {
                int prod = num1 * num2;
                System.out.println("Product of two numbers: " + prod);
                break;
            }

            case '/': {
                if (num2 != 0) {
                    int quo = num1 / num2;
                    System.out.println("Quotient of two numbers: " + quo);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            }

            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
