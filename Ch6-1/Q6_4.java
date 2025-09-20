package KEH_ICPC;
import java.util.*;

public class Q6_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String[] arr=a.split("");
		int count=0;
		
		while(true) {
			if(count==(arr.length/2)) {
				System.out.printf("1");
				break;
			}
			else if(arr[count].equals(arr[arr.length-1-count])) {
				count+=1;
				continue;
			}
			else if(!arr[count].equals(arr[arr.length-1-count])) {
				System.out.printf("0");
				break;
			}
		}
		sc.close();
	}
}
