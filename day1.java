import java.util.*;

class day1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char st = sc.next().charAt(0);
        if (Character.isAlphabetic(st) )
        {
            
        if (st == 'A' || st == 'E' || st == 'I' || st == 'O' || st == 'U' || st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u')
        System.out.println("Vowel");

        else
        System.out.println("Consonent");

        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}