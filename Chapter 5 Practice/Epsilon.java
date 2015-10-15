
import java.util.Scanner;
/**
 * Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative." Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
    public final static double EPSILON=1e-12;
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double i=in.nextDouble();
        
        String adj="";
        if (Math.abs(i)<1.0)
        {
            adj="small";
        }
        
        else if (Math.abs(i)>1000000)
        {
            adj="large";
        }
        
      if (Math.abs(i)<EPSILON)
        {
            System.out.println("It is zero");
        }
        else if (i>0)
        {
            System.out.println("It is a "+adj+" positive number");
    
        }
        else if (i<0)
        {
            System.out.println("It is a "+adj+" negative number");
    
        }
    }
}
