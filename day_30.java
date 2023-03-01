import java.util.*;;
public class day_30 {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        char ch[]=str1.toCharArray();
        for(char c : ch)
        {
            i++;
        }
        System.out.println("Length of the string = "+i);
    }
}
