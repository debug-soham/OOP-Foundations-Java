import java.util.Scanner;

public class Factorial
{
    public static double factorial(int num)
    {
        double fact = 1;

        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
        sc.close();
    }
    
}