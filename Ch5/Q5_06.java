package keh0915;
import java.util.*;

public class Q5_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String S=sc.next();
		int[] a=new int[26];
		Arrays.fill(a,-1);
		
		
		for(int i=0;i<S.length();i++) {
			char x=S.charAt(i);
			if(a[x-97]!=-1) {continue;}
			else a[x-97]=i;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}
}
