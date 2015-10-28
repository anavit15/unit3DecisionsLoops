
import java.util.Scanner;
/**
 * Write a description of class CompareAdjacentValues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompareAdjacentValues
{   
    public static final double EPSILON=1e-12;
    public static void checkForDuplicates()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit: ");
        double input=scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double previousInput=input;
            input=scan.nextDouble();
            
            if(Math.abs(input-previousInput)<EPSILON)
            {
                System.out.println("Duplicate input");
            }
        }
    }
                

}
