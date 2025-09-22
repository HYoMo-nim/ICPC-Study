package KEH_ICPC;
import java.util.*;

public class Q6_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String[] arr=new String[a];
		int b=0;
		
		for(int i=0; i<a; i++) {
			String[] x=arr[i].split("");
			
			for(int j=0;j<x.length;j++) {
				for(int k=0; k<j; k++) {
					if(x[j].equals(x[k])) {
						if(k!=j-1) break;
						else b+=1; continue;
					}
				}
			}
		}
		
		/* 이 이상 코드를 작성을 못했습니다. 풀이하신 분 금요일에 풀이 부탁드리겠습니다. */
				
		sc.close();
	}
}
