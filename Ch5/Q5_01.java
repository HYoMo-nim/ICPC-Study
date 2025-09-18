package keh0915;
import java.util.*;

public class Q5_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String S=sc.next();
		int i=sc.nextInt();
		
		String[] arr=S.split("");
		System.out.println(arr[i-1]);
		
		sc.close();
	}
}
