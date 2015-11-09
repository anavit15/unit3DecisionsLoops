import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class MontyHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MontyHall
{
    public static void main (String [] args)
    {
        final int CAR=0;
        final int GOAT1=1;
        final int GOAT2=2;
        int door0=-1;
        int door1=-1;
        int door2=-1;
        Random carGen=new Random();
        int carDoor=carGen.nextInt(3);
        if (carDoor==0)
        {
            door0=CAR;
            door1=GOAT1;
            door2=GOAT2;
        }else if (carDoor==1)
        {
            door1=CAR;
            door0=GOAT1;
            door2=GOAT2;
        }else{
            door2=CAR;
            door0=GOAT1;
            door1=GOAT2;
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Pick door 0,1,or 2: ");
        int userChoice=scan.nextInt();
        if (userChoice==0)
        {
            userChoice=door0;
        }else if (userChoice==1)
        {
            userChoice=door1;
        }else{
            userChoice=door2;
        }
        int computerChoice=0;
        if (door0!=userChoice && door0!=CAR)
        {
            computerChoice=door0;
            System.out.println("We chose door0!There is a goat inside.");
        }else if (door1!=userChoice && door1!=CAR)
        {
            computerChoice=door1;
            System.out.println("We chose door1!There is a goat inside.");
        }else if (door2!=userChoice && door2!=CAR)
        {
            computerChoice=door2;
            System.out.println("We chose door2!There is a goat inside.");
        }
        System.out.println("Do you want to switch to the remaining door (y/n): ");
        
      
    }

}
