package KEH_ICPC;
import java.util.*;

public class Q7_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[5][15];
		
		for(int i=0;i<5;i++) {
			String s=sc.nextLine();
			for(int j=0;j<s.length();j++) {
				arr[i][j]=String.valueOf(s.charAt(j));
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i]!=null) System.out.print(arr[j][i]);
				else continue;
			}
		}
		
		sc.close();
	}
}
