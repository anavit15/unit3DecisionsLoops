

/**
 * Write a description of class StringCompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class StringCompare
     */
    public static void main(String [] args)
    {
        // initialise instance variables
       String word1 = "catalog";
       String word2 = "cat";
       
       if (word1.compareTo("aaa") >0 ){
           System.out.println("Word1 is lexographically greater than aaa");
        }
        if (word1.compareTo(word2) ==0) {
           System.out.println("Word1 is lexographically equal to word2");
        }
        else {
            System.out.println("Word1 is not lexographically equal to word2");
        }
        if (word1.compareTo(word2) <0) {
           System.out.println("Word2 is lexographically greater than word1");
        }
        String word1Sub=word1.substring(0,3);
        String word2Sub=word2.substring(0,3);
        if (word1Sub.compareTo(word2Sub) ==0) {
           System.out.println("The first three characters are lexographically equal to the first three characters of word 2");
        }
    }

  

}
