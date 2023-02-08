import java.util.*;

public class day4 {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        if (a==0){
            System.out.println("Neither positive nor negative");
        }else if (a>0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
