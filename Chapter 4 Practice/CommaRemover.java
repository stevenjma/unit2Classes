import java.util.Scanner;

public class CommaRemover
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer between 1,000 and 999,999.");
        String num = s.next();
        int comma = num.indexOf(",");
        System.out.println(num.substring(0, comma)+ num.substring(comma+1, num.length()));
    }
}
