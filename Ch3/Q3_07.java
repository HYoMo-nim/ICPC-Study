package keh0915;
import java.util.Scanner;

public class Q3_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		int[] a=new int[count];
		
		for(int i=0;i<count;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			a[i]=x+y;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("Case #"+(i+1)+": "+a[i]);
		}
		
		sc.close();
	}
}
