package KEH_ICPC;
import java.util.*;

public class Q7_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int paper=sc.nextInt();
		int[][] board=new int[100][100];
		int black=0;
		
		for(int i=0;i<paper;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int j=x; j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					board[j][k]++;
				}
			}
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(board[i][j]>0) black++;
			}
		}
		
		System.out.println(black);
		sc.close();
	}
}
