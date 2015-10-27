
import java.util.Scanner;
/**
 * Write a description of class MaxAndMin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaxAndMin
{
    public static double maximum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a series of numbers or any character to quit: ");
        double largest=scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double input=scan.nextDouble();
            if (input>largest)
            {
                largest=input;
            }
        }
        return largest;
    }
    
      public static double minimum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a series of numbers or any character to quit: ");
        double smallest=scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double input=scan.nextDouble();
            if (input<smallest)
            {
                smallest=input;
            }
        }
        return smallest;
    }


}
