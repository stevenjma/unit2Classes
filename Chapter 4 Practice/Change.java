import java.util.Scanner;

public class Change
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount due in pennies.");
        int amount = s.nextInt();
        System.out.println("Enter the amount paid in pennies.");
        int paid = s.nextInt();
        int change = paid - amount;
        if (change < 0)
        {
            System.out.println("You baffoon. He owes you money!");
        }
        else
        {
            int quarters = change / 25;
            int dimes = (change % 25) / 10;
            int nickels = (change - (25 * quarters) - (10 * dimes)) / 5;
            int pennies = (change % 5);
            System.out.println("You owe the customer " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");
        }
       
    }
}
