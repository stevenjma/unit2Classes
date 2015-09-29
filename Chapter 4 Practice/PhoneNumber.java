import java.util.Scanner;

public class PhoneNumber
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your phone number.");
        String number = s.next();
        System.out.println("(" + number.substring(0,3) + ") " + number.substring(3,6) + "-" + number.substring(6,number.length())); 
    }
}
