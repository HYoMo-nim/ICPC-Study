package KEH_ICPC;
import java.util.*;

public class Q6_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String[] arr=a.split("");
		String[] alphabet=new String[26];
		int[] count=new int[26];
		Arrays.fill(count, 0);
		String max="";
		
		for(int i=0;i<26;i++) {
			char x=(char)(97+i);
			alphabet[i]=String.valueOf(x);
		}
		
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<26;j++) {
				if(arr[i].equalsIgnoreCase(alphabet[j])) {
					count[j]++;
				}
			}
		}
		
		int b=0;
		for(int k=0;k<26;k++) {
			if(count[k]>b) {
				max=alphabet[k].toUpperCase();
				b=count[k];
			}
			else if(count[k]==b&&b!=0) {
				max="?";
			}
		}
		
		System.out.printf(max);	
		sc.close();
	}
}
