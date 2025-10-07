

public class Fibonacci {

    // Static variable to count recursive calls
    static int callCount = 0;

    // Recursive method to compute nth Fibonacci number
    static int fibonacci(int n) {
        callCount++; // Count every time the function is called

        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7; // Number of Fibonacci numbers to print

        System.out.println("First " + n + " Fibonacci numbers:");

        // Loop to print each Fibonacci number from 0 to n-1
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Print the total number of recursive calls made
        System.out.println("\nTotal recursive calls made: " + callCount);
    }
}
