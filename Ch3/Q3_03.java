package keh0915;
import java.util.Scanner;

public class Q3_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<a;i++) {
			sum+=a-i;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
