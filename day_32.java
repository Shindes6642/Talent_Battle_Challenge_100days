import java.util.*;
public class day_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String s1 = "";
        s1 = str.replaceAll("[aeiou]", "");
        System.out.println(s1);
    }
}
