import java.util.*;
import java.lang.*;
public class day8 {
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = ( b*b) - (4*a*c);
        if (x > 0)
        {
            double r1 = (-b + Math.sqrt(x) ) / (2*a) ;
            double r2 = (-b - Math.sqrt(x) ) / (2*a) ;
            System.out.println("Roots are Distinct");
            System.out.println("Root1 = " + r1 + " Root2 = "+ r2);
        } 

        else if (x == 0)
        {
            double r1 = -b/(2*a) ;
            System.out.println("Roots are equal");
            System.out.println("Root1 =  Root2 = "+ r1);
        } 

        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}
