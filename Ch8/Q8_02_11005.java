package KEH_ICPC;
import java.util.*;

public class Q8_02_11005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextLong();
		long B=sc.nextLong();

		char[] arr=new char[64];
		
		int x=0;
		while(N>0) {
			long a=N%B;
			
			if(a>=10&&a<=35) arr[x]=(char)('A'+(a-10));
			else arr[x]=(char)('0'+a);
			
			N/=B;
			x++;
		}
		
		for(int i=x-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
