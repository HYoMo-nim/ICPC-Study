package keh0915;
import java.util.*;

public class Q2_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int hour=sc.nextInt();
		int min=sc.nextInt();
		int time=sc.nextInt();
		
		int cookmin=min+time;
		
		if(cookmin>=60) {
			while(cookmin>=60) {
				hour+=1;
				cookmin-=60;
				if(hour==24) hour=0;
			}
		}
	
		System.out.printf("%d %d", hour, cookmin);
		sc.close();
	}
}
