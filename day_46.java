import java.util.Scanner;

public class day_46 {
    public static void main(String args[]) {
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {  
            sum = sum + arr[i];  
         }  
         System.out.println("Sum of an array elements: " + sum);  
    }
}
