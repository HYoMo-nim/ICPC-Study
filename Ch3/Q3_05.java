package keh0915;
import java.util.Scanner;

public class Q3_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int bit=sc.nextInt();
		int count=bit/4;
		
		for(int i=0;i<count;i++) {
			System.out.printf("long ");
		}
		
		System.out.printf("int");
		
		sc.close();
	}
}
