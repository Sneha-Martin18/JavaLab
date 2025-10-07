import java.util.Scanner;
public class Vowels
{
    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the letter :");
        char ch = n.next().toLowerCase().charAt(0);
        
          // Check if it's a letter before proceeding
        if (!Character.isLetter(ch))
        {
            System.out.println("Invalid input. Please enter an alphabet letter.");
            return;
        }
        
         switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }

    }
}