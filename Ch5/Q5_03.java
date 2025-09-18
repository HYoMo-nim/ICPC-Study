package keh0915;
import java.util.*;

public class Q5_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String[] x=new String[a];
		
		for(int i=0;i<a;i++) {
			String S=sc.next();
			int b=S.length();
			String[] arr=S.split("");
			
			if(a==1) x[i]=arr[0]+arr[0];
			else if(a==2) x[i]=arr[0]+arr[1];
			else x[i]=arr[0]+arr[b-1];
		}
		
		for(int i=0;i<a;i++) {
			System.out.println(x[i]);
		}
		
		sc.close();
	}
}
