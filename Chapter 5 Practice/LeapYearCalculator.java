import java.util.Scanner;
public class LeapYearCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the year: ");
      int year= in.nextInt(); 
     
      if (year%400==0)
      {
        System.out.println("It is a leap year");
      }
      else if (year%100==0)
      {
        System.out.println("It is not a leap year");
      }
      else if (year%4==0)
      {
         System.out.println("It is a leap year");
      }
      else 
      {
          System.out.println("It is not a leap year");
      }
          
   }
}