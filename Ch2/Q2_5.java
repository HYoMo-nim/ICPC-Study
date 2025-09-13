package keh0915;
import java.util.*;

public class Q2_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int hour=sc.nextInt();
		int min=sc.nextInt();
		
		if(min<45) {
			if(hour==0) {
				hour=23;
				min+=60;
			}
			else {
				hour-=1;
				min+=60;
			}
		}
		
		System.out.printf("%d %d", hour, min-45);
		
		sc.close();
	}
}
