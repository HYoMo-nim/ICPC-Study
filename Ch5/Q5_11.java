package keh0915;
import java.util.*;

public class Q5_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="";
		
		while(sc.hasNext()) {
			String x=sc.nextLine();
			if(x.isEmpty()) break;
			a+=x+"\n";
		}
		
		System.out.println(a);
		sc.close();
	}
}
