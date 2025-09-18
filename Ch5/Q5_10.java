package keh0915;
import java.util.*;

public class Q5_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String S=sc.next();
		int second=0;
		
		for(int i=0;i<S.length();i++) {
			char x=S.charAt(i);
			if(x-65>=0&&x-65<3) second+=3;
			else if(x-65>=3&&x-65<6) second+=4;
			else if(x-65>=6&&x-65<9) second+=5;
			else if(x-65>=9&&x-65<12) second+=6;
			else if(x-65>=12&&x-65<15) second+=7;
			else if(x-65>=15&&x-65<19) second+=8;
			else if(x-65>=19&&x-65<22) second+=9;
			else second+=10;
		}
		
		System.out.println(second);
		sc.close();
	}
}
