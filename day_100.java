import java.util.*;
import java.lang.*;
import java.io.*;

class day_100 {
    
	public static void main (String[] args) throws java.lang.Exception {
	    
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
		    int[] arr = new int[4];
		    for(int j=0; j<4; j++) {
		        arr[j] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int res = 0;
		    if(arr[0] != arr[3])
		        res++;
		    if(arr[1] != arr[2])
		        res++;
		    if(arr[0] != arr[3] && arr[1] == arr[2] && arr[0] != arr[1] && arr[2] != arr[3])
		        res++;
	        System.out.println(res);
		}
	}
}
