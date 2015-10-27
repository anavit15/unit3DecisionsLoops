import java.util.Scanner;

/**
 * Write a description of class PromptUntilMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PromptUntilMatch
{
    public static double promptUntilMatch()
    {
        Scanner scan=new Scanner(System.in);
        boolean valid=false;
        double input=0;
        
        do 
        {
            System.out.print("Please enter a positive value<100: ");
            input=scan.nextDouble();
            if (input>0 && input<100)
            {
                valid=true;
            }
        }
        while (!valid);
        return input;
    }
}

