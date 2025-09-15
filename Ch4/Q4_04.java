package keh0915;
import java.util.*;

public class Q4_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[9];
		int max=0;
		int maxpos=0;
		
		for(int i=0;i<9;i++) {
			num[i]=sc.nextInt();
			if(max<num[i]) {
				max=num[i];
				maxpos=i;
			}
		}
		
		System.out.println(max+"\n"+(maxpos+1));
		
		sc.close();
	}
}
