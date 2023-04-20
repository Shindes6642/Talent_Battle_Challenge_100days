import java.util.*;
import java.lang.*;
import java.io.*;

class day_58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if(a>=b){
		        System.out.println(a-b);
		    }
		    else {
		        System.out.println(b-a);
		    }
		}
	}
}