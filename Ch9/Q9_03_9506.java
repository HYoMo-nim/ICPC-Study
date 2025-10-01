package KEH_ICPC;
import java.util.*;

public class Q9_03_9506 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int a=sc.nextInt();
			Vector<Integer> v=new Vector<>();
			
			if(a<0) break;
			else {
				int sum=0;
				for(int i=1;i<a;i++) {
					if(a%i==0) {
						sum+=i;
						v.add(i);
					}
				}
				
				if(sum==a) {
					System.out.printf(a+" = ");
					for(int i=0;i<v.size();i++) {
						if(i!=v.size()-1) System.out.printf(v.get(i)+" + ");
						else System.out.println(v.get(i));
					}
				}
				else System.out.println(a+" is NOT perfect.");
			}
		}
		sc.close();
	}
}
