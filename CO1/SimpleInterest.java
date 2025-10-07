import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String []args)
    {
        Scanner sn = new Scanner(System.in);
        {
            System.out.println("Enter the amount :");
            double p = sn.nextDouble();

            System.out.println("Enter the rate interest :");
            double r = sn.nextDouble();

            System.out.println("Enter the time period :");
            double t = sn.nextDouble();

            double si = (p*r*t)/ 100;

             System.out.println("Simple Interest :" +si);
             //System.out.printf("Simple Interest : %.3f\n", + si);

        //sn.close(); 
        }
    }
}