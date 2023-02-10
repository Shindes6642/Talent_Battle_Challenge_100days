import java.util.Scanner;

public class day_21 {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int r,sum=0;
        int temp=no;
        while(no>0)
        {
            r=no%10;
            sum=(sum*10)+r;
            no=no/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
