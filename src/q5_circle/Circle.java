import java.util.Scanner;
import java.lang.Math;

public class Circle
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public static double circum(double radius)
    {
        return 2*Math.PI*radius;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);

        System.out.println("Factorial of " + radius + " is " + c1.area());
        System.out.println("Factorial of " + radius + " is " + circum(radius));

        sc.close();
    }
    
}