import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String input = sc.nextLine(); // don't trim—spaces could be part of the name

        File f = new File(input);

        System.out.println("File name: " + f.getName());
        System.out.println("File exists: " + f.exists());
        System.out.println("Absolute path: " + f.getAbsolutePath());
    }
}
