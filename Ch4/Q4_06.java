package keh0915;
import java.util.Scanner;

public class Q4_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int basket=sc.nextInt();
		int change=sc.nextInt();
		
		int[] a=new int[basket];
		
		for(int i=0;i<basket;i++) {
			a[i]=i+1;
		}
		
		for(int i=0;i<change;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=0;
			
			z=a[x-1];
			a[x-1]=a[y-1];
			a[y-1]=z;	
		}
		
		for(int i=0;i<basket;i++) {
			System.out.printf(a[i]+" ");
		}
		sc.close();
	}
}
