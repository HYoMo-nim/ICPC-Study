package keh0915;
import java.util.Scanner;

public class Q3_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();

		for(int i=1;i<=a;i++) {
			int b=0;
			for(int j=a;j>i;j--) {
				System.out.printf(" ");
			}
			while(i>b) {
				System.out.printf("*");
				b++;
			}
			System.out.println();
		}
		sc.close();
	}
}
