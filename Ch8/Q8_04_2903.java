package KEH_ICPC;
import java.util.*;

public class Q8_04_2903 {
	public static void main(String[] args) {
		// 등비수열 문제. 등비수열 An=2^n.
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int start=2;
		int result=0;
		
		for(int i=0;i<a;i++) {
			start+=Math.pow(2, i);
			result=start*start;
		}
		
		System.out.println(result);
		sc.close();
	}
}
