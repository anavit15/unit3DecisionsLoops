

/**
 * Write a description of class RewriteLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RewriteLoops
{
    int s=0;
    int i=1;
    
    public static void main (String[] args)
    {
        /**while (i<=10)
        {
            s=s+i;
            i++
        }*/
        int n=in.nextInt();
        double x=0;
        double s;
        s=1.0/(1+n*n);
        n++;
        x=x+s;
        while (s>0.01)
        {
            s=1.0/(1+n*n);
        n++;
        x=x+s;
       }
    }
}
        
