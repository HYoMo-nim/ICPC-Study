package keh0915;
import java.util.*;

public class Q5_08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(a, " ");
		System.out.println(st.countTokens());
		
		sc.close();
	}
}
