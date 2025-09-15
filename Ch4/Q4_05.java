package keh0915;
import java.util.*;

public class Q4_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int basket=sc.nextInt();
		int ball=sc.nextInt();
		
		int[] b=new int[basket];
		
		for(int i=0;i<ball;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt(); 
			int z=sc.nextInt();
			
			for(int j=x-1; j<y;j++) {
				b[j]= z;
			}
		}
		
		for(int i=0;i<basket;i++) {
			System.out.printf(b[i]+" ");
		}
		
		sc.close();
	}
}
