import java.util.Random;
public class Randnum
{
    public static void main(String [] args)
    {
        Random r = new Random();

        int r1 = r.nextInt(10);
        
        System.out.println("Random Integers : " +r1);


    }
}