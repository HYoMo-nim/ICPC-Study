package keh0915;
import java.io.*;
import java.util.*;


public class Q3_06 {
	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		try {
			int a=Integer.parseInt(bf.readLine());
			for(int i=0;i<a;i++) {
				st=new StringTokenizer(bf.readLine());
				bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			}
			
			bw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
