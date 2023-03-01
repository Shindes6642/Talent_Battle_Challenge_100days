import java.util.*;
public class day_33 {
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str))
        System.out.print("Palindrome");
        else
        System.out.print("Not a palindrome");
    }
}
