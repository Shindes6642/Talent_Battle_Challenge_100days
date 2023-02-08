import java.util.*;
import javax.print.event.PrintJobListener;
public class day9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int cnt =0;
        while(no != 0 )
        {
            no = no/10;
            cnt++;

        }
        System.out.println(cnt);

    }   
}
