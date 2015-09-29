import java.util.Scanner;

public class CommaAdder
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer between 1,000 and 999,999.");
        String num = s.next();  
        System.out.println(num.substring(0,num.length()-3) + "," + num.substring(num.length()-3, num.length()));
    }
        
}