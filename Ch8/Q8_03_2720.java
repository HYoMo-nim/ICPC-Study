package KEH_ICPC;
import java.util.*;
import java.io.*;

public class Q8_03_2720 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		int[] arr=new int[count];
		for(int i=0;i<count;i++) {
			arr[i]=sc.nextInt();
		}
		
		String[] result=new String[count];
		for(int i=0;i<count;i++) {
			int Q=0, D=0, N=0, P=0;
			Q=arr[i]/25; 
			arr[i]%=25;
			
			D=arr[i]/10;
			arr[i]%=10;
			
			N=arr[i]/5;
			arr[i]%=5;
			
			P=arr[i];
			
			result[i]=Q+" "+D+" "+N+" "+P;
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
	}
}
