package KEH_ICPC;
import java.util.*;

public class Q6_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=0;
		float all=0;
		
		for(int i=0;i<20;i++) {
			String subject=sc.next();
			double score=sc.nextFloat();
			String grade=sc.next();

			if(grade.equals("P")) continue;
			else if(grade.equals("A+")) {all+=score*4.5; sum+=score;}
			else if(grade.equals("A0")) {all+=score*4.0; sum+=score;}
			else if(grade.equals("B+")) {all+=score*3.5; sum+=score;}
			else if(grade.equals("B0")) {all+=score*3.0; sum+=score;}
			else if(grade.equals("C+")) {all+=score*2.5; sum+=score;}
			else if(grade.equals("C0")) {all+=score*2.0; sum+=score;}
			else if(grade.equals("D+")) {all+=score*1.5; sum+=score;}
			else if(grade.equals("D0")) {all+=score*1.0; sum+=score;}
			else if(grade.equals("F")) {all+=score*0; sum+=score;}
		} 
		
		System.out.println(all/sum);
				
		sc.close();
	}
}