import java.util.*;
public class day_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people in the room: ");
        int num = sc.nextInt();
        int total = num * (num-1) / 2;
        System.out.println("Total number of handshakes = "+total);
    }
       
}
