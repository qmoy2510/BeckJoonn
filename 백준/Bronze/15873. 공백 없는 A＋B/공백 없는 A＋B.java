import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(br.readLine());
		int result = -1;
		if(sb.length()==2) {
			result=(sb.charAt(0)-'0')+(sb.charAt(1)-'0');
		}
		else if(sb.length()==3) {
			if(sb.charAt(1)=='0') {				
				result=Integer.parseInt(sb.substring(0,2))+(sb.charAt(2)-'0');
			}
			else if(sb.charAt(2)=='0') {
				result=Integer.parseInt(sb.substring(1,3))+(sb.charAt(0)-'0');				
			}
		}
		else if(sb.length()==4) {			
			result=20;				
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}