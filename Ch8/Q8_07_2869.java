package KEH_ICPC;
import java.util.*;

public class Q8_07_2869 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int V=sc.nextInt();
		
		V-=a;
		
		int day=1;
		if(V>0) {
			day+=V/(a-b);
			if(V%(a-b)!=0) day++;
		}
		
		System.out.println(day);
		sc.close();
	}
}
