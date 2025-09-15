package keh0915;
import java.util.*;

public class Q4_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		int[] a=new int[count];
		
		for(int i=0;i<count;i++) {
			a[i]=sc.nextInt();
		}
		
		int num=sc.nextInt();
		int x=0;
		
		for(int i=0; i<count;i++) {
			if(a[i]==num) x++;
		}
		
		System.out.println(x);
		sc.close();
	}
}
