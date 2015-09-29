import java.util.Scanner;

public class Rectangle
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle.");
        double length = s.nextDouble();
        System.out.println("Enter the width of the rectangle.");
        double width = s.nextDouble();
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}