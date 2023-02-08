import java.util.*;

public class day7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter Month:");
        int month=sc.nextInt();
        System.out.print("Enter Year:");
        int year=sc.nextInt();
        if(((month==2) && (year%400==0)) || ((year%100!=0)&&(year%4==0)))

        {
            System.out.println("Number of days is 29");
        }
        else if(month==2)
        {
            System.out.println("Number of days is 28");
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            System.out.println("Number of days is 30");
        }else{
            System.out.println("Number of days is 31");
        }
    }
}
