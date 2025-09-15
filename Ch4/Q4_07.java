package keh0915;
import java.util.*;

public class Q4_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] student= new int[30];
		Arrays.fill(student, 0);
		
		for(int i=0;i<28;i++) {
			int x=sc.nextInt();
			student[x-1]=x;
		}
		
		for(int i=0;i<30;i++) {
			if(student[i]==0) System.out.println(i+1);
		}
		
		sc.close();
	}
}
