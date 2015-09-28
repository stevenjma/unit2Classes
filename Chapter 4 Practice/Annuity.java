import java.util.Scanner;

public class Annuity
{
    public static void main( String [] args)
    {
        System.out.println("Enter the interest rate. ");
        Scanner a = new Scanner(System.in);
        double pv;
        double interest = a.nextDouble();
        System.out.println("Enter the periodic payment. ");
        double pmt = a.nextDouble();
        System.out.println("Enter the number of years. ");
        double num = a.nextDouble();
        pv = (pmt) * ((((Math.pow(1 + interest, num - 1)) - 1)/interest)/(Math.pow(1 + interest, num - 1)) + 1);
        System.out.println(pv);
    }
}
