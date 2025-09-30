package KEH_ICPC;
import java.util.*;

public class Q8_06_1193 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int count=1;
		int N=a;
		
		while(N>count) {
			N-=count;
			count++;
			
			
		}
		
		int x=0, y=0;
		
		if(count==1) System.out.println("1/1");
		else {
			if(count%2==0) {
				x=(count+1)-N;
				y=N;
				System.out.println(y+"/"+x);
			}
				
			else if(count%2==1) {
				x=N;
				y=(count+1)-N;
				System.out.println(y+"/"+x);
			}
		}
		
		sc.close();
	}
}
