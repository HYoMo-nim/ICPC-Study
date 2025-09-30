package KEH_ICPC;
import java.util.*;

public class Q8_05_2292 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		
		while(N>1) {
			if(N-6>=0) {
				count+=1;
				N-=6*count;
			}
			else {
				count++;
				break;
			}
		}
		
		System.out.println(count+1);
		sc.close();
	}
}
