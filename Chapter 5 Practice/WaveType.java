import java.util.Scanner;
public class WaveType
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the wavelength value: ");
      double wavelength= in.nextDouble(); 
     
      if (wavelength<1e-11)
      {
        System.out.println("It is a gamma ray");
      }
      else if (wavelength>=1e-11 && wavelength<1e-8)
      {
        System.out.println("It is a x-ray");
      }
      else if (wavelength>=1e-8 && wavelength<4e-7)
      {
        System.out.println("It is ultraviolet");
      }
      else if (wavelength>=4e-7 && wavelength<7e-7)
      {
        System.out.println("It is visible");
      }
      else if (wavelength>=7e-7 && wavelength<1e-3)
      {
        System.out.println("It is infrared ");
      }
      else if (wavelength>=1e-3 && wavelength<1e-1)
      {
        System.out.println("It is a microwave");
      }
      else 
      {
          System.out.println("It is a radio wave");
      }
          
   }
}