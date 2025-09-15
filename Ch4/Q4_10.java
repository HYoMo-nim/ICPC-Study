package keh0915;
import java.util.Scanner;

public class Q4_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int subject=sc.nextInt();
		double[] score=new double[subject];
		double max=0;
		double sum=0;
		
		for(int i=0;i<subject;i++) {
			score[i]=sc.nextInt();
			if(max<score[i]) max=score[i];
		}
		
		for(int i=0;i<subject;i++) {
			score[i]=score[i]/max*100;
			sum+=score[i];
		}
		
		System.out.print(sum/subject);	
		sc.close();
		}
}
