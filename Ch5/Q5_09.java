package keh0915;
import java.util.*;

public class Q5_09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		int[] first=new int[3];
		int[] second=new int[3];
		
		String[] x=a.split("");
		String[] y=b.split("");
		
		for(int i=0;i<a.length();i++) {
			first[i]=Integer.parseInt(x[2-i]);
		}
		
		for(int i=0;i<b.length();i++) {
			second[i]=Integer.parseInt(y[2-i]);
		}
		
		int one=first[0]*100+first[1]*10+first[2];
		int two=second[0]*100+second[1]*10+second[2];
		
		if(one<two) System.out.println(two);
		else System.out.println(one);
		sc.close();
	}
}
