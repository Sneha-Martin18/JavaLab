import java.util.Scanner;
public class CheckRet
{
static int age(int age)
{
if ( age >= 18)
{
return 1;
}
else
{
return 0;
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{
int num;
System.out.println("Enter the age :");
num = sc.nextInt();
if (age(num) == 1);
{
System.out.println("Access granted");
}	
else {
System.out.println("Access Denied");
}
 }