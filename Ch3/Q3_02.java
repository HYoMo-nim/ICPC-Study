package keh0915;
import java.util.Scanner;

public class Q3_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] b=new int[a];
		
		for(int i=0;i<a;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			b[i]=x+y;
		}
		
		for(int i=0;i<a;i++) {
			System.out.println(b[i]);
		}
		
		sc.close();
	}
}
