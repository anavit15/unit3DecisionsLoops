
import java.util.Scanner;
/**
 * Write a description of class Substring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Substring
{
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word that has five letters or less: ");
        String word=scan.next();
        
        for (int i=0;
            i<word.length();
             i++)
        {
            System.out.println(word.substring(i,i+1));
        }
        for (int i=0;
            i<(word.length()-1);
             i++)
        {
            System.out.println(word.substring(i,i+2));
        }
        for (int i=0;
            i<(word.length()-2);
             i++)
        {
            System.out.println(word.substring(i,i+3));
        }
        for (int i=0;
            i<(word.length()-3);
             i++)
        {
            System.out.println(word.substring(i,i+4));
        }
        for (int i=0;
            i<(word.length()-4);
             i++)
        {
            System.out.println(word.substring(i,i+5));
        }
        
    }
             
            
   
      
        

}
