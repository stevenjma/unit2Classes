import java.util.Scanner;

public class Change
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount due.");
        double amount = s.nextDouble();
        System.out.println("Enter the amount paid.");
        double paid = s.nextDouble();
        double change = amount - paid;
        if (change < 0)
        {
            System.out.println("You baffoon. He owes you money!");
        }
        else
        {
            
        }
       
    }
}
