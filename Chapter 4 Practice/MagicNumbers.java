public class MagicNumbers
{
   public static void main(String[] args)
   {
      final double feetPerYard = 3;
      final double inchesPerFoot = 12;
      double yards = 3.5;
      double feet = yards * feetPerYard;
      double inches = feet * inchesPerFoot;
      
      System.out.println(yards + " yards equals " + feet + " feet");
      System.out.println(yards + " yards equals " + inches + " inches");
   }
}