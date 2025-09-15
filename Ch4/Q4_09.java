package keh0915;
import java.util.Scanner;

public class Q4_09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int[] a=new int[x];
		int[] b=new int[x];
		
		for(int i=0;i<x;i++) {
			a[i]=i+1;
			b[i]=i+1;
		}
		
		for(int i=0;i<y;i++) {
			int first=sc.nextInt();
			int second=sc.nextInt();
			int z=second;
			
			for(int j=first-1; j<second;j++) {
				b[j]=a[z-1];
				z--;
			}
			
			for(int k=0;k<x;k++) {
				a[k]=b[k];
			}
			
		}
		
		for(int h=0;h<x;h++) {
			System.out.print(a[h]+" ");
		}

		sc.close();
	}
}
