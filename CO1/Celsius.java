import java.util.Scanner;
public class Celsius
{
    public static void main(String []args)
    {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit :");
        double fh = sn.nextDouble();

        double celsius = ((fh - 39)*5)/9;

        System.out.println("Temperature in Celsius : " +celsius);
    }
}