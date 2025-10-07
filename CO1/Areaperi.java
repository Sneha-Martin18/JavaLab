import java.util.Scanner;
public class Areaperi
{ 
    public static void main (String [] args)
    {
            Scanner scanner = new Scanner(System.in);
            {
                System.out.println("Enter the length : ");
                double len = scanner.nextDouble();

                System.out.println("Enter the breadth : ");
                double bre = scanner.nextDouble();

                double area = len * bre;
                double perimeter = (len + bre)*2;

                System.out.println("Length : " + len);
                System.out.println("Breadth : " + bre);
                System.out.println("Area :"+ area);
                System.out.println("Perimeter : "+ perimeter);
            }
    }
    
}
