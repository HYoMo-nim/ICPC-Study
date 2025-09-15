package keh0915;
import java.util.*;

public class Q4_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] b=new int[a];
		int min=1000000, max=-1000000;
		
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			if(min>b[i]) min=b[i];
			if(max<b[i]) max=b[i];
		}
		
		System.out.printf(min+" "+max);
		sc.close();
	}
}
