package KEH_ICPC;
import java.util.*;

public class Q6_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] find=new int[6];
		for(int i=0;i<6;i++) {
			find[i]=sc.nextInt();
		}
		
		System.out.println((1-find[0])+" "+(1-find[1])+" "
				+(2-find[2])+" "+(2-find[3])+" "
				+(2-find[4])+" "+(8-find[5]));
		sc.close();
	}
}
