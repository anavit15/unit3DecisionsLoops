import java.util.Scanner;

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=scan.nextInt();
        
        for (int sideLength=1; sideLength<=num;sideLength++)
        {
            for (int i=1;
                i<=num;
                 i+=2)
            {
                System.out.print("*");
                
            }
        }
    }
    

}

