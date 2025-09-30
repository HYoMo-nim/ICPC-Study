package KEH_ICPC;
import java.util.*;

public class Q8_01_2745 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String N=sc.next();
		long B=sc.nextInt();
		long sum=0;
		long a=1;
		
		for(int i=N.length()-1;i>=0;i--) {
			char c=N.charAt(i);
			
			if(N.charAt(i)>='A'&&N.charAt(i)<='Z') sum+=(N.charAt(i)-'A'+10)*a;
			else sum+=(N.charAt(i)-'0')*a;
			
			a*=B;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
