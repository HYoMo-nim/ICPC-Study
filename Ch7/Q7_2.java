package KEH_ICPC;
import java.util.*;

public class Q7_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] arr1=new int[9][9];
		int max=-1;
		int row=0, column=0;
		
		for(int i=0; i<9; i++) {
			for(int j=0;j<9;j++) {
				arr1[i][j]=sc.nextInt();
				if(max<arr1[i][j]) {
					max=arr1[i][j];
					row=i+1;
					column=j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row+" "+column);
		sc.close();
	}
}
