package keh0915;
import java.util.*;

public class Q5_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int sum=0;
		
		String x=sc.next();
		String[] b=x.split("");
		for(int i=0;i<a;i++) {
			sum+=Integer.parseInt(b[i]);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
