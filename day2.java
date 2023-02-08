import java.util.*;

class day2{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if (Character.isAlphabetic(a))
        System.out.println("Alphabet");
        else
        System.out.println("Not a Alphabet");

    }
}