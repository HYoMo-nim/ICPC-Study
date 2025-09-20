package KEH_ICPC;
import java.util.*;

public class Q6_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int star=sc.nextInt();
		int start=1;
		
		while(start<=star) {
			int non=star-start;
			for(int i=0;i<non;i++){
				System.out.printf(" ");
			}
			
			for(int j=0; j<(start*2-1); j++) {
				System.out.printf("*");
			}
			System.out.printf(" \n");
			start++;
		}
		
		int end=star-1;
		while(end>0) {
			int non=star-end;
			for(int i=0;i<non;i++){
				System.out.printf(" ");
			}
			
			for(int j=0; j<(end*2-1); j++) {
				System.out.printf("*");
			}
			System.out.printf(" \n");
			end--;
		}
		sc.close();
	}
}