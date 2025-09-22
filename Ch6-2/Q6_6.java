package KEH_ICPC;
import java.util.*;

public class Q6_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		String[] cro= {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
		
		for(String c:cro) {
			a=a.replace(c, "*");
		}
		
		System.out.println(a.length());
		sc.close();
	}
}
