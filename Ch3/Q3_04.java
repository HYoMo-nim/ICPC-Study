package keh0915;
import java.util.Scanner;

public class Q3_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int total=sc.nextInt();
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<a;i++) {
			int price=sc.nextInt();
			int count=sc.nextInt();
			sum+=(price*count);
		}
		
		if(total==sum) System.out.println("Yes");
		else System.out.println("No");
		
		
		sc.close();
	}
}
