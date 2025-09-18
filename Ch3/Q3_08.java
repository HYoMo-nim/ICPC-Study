package keh0915;
import java.util.Scanner;

public class Q3_08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		
		for(int i=0;i<count;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + x + " + " + y + " = " + (x+y));
		}
		
		sc.close();
	}
}
