import java.util.*;
import javax.print.event.PrintJobListener;
public class day12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int no = sc.nextInt();
            int sum =0;
            
            while(no > 0)
            {
                int d = no%10;
                sum = sum +d;
                no = no/10;
            }
    
            System.out.println(sum);
        }
    }   
