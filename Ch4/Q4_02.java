package keh0915;
import java.util.*; 

public class Q4_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] x=new int[a];
		
		for(int i=0;i<a;i++) {
			x[i]=sc.nextInt();
		}
		
		for(int i=0;i<a;i++) {
			if(x[i]<b) System.out.printf(x[i]+" ");
		}
		
		sc.close();
	}
	
}
