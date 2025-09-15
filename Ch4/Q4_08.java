package keh0915;
import java.util.*;

public class Q4_08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		int[] b=new int[10];
		int count=10;
		
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
			b[i]=a[i]%42;
			for(int j=0;j<i;j++) {
				if(b[i]==b[j]) {
					count--;
					break;
				}
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
