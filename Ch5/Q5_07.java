package keh0915;
import java.util.*;

public class Q5_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) {
			int x=sc.nextInt();
			String y=sc.next();
			String[] arr=y.split("");
			
			for(int j=0;j<y.length();j++) {
				for(int k=0;k<x;k++) {
					System.out.print(arr[j]);
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
