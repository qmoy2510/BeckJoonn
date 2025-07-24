import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(br.readLine());
		int n = sb.length(), s=0;
		String str1 = sb.substring(0, n/2);
		String str2 = sb.substring((n/2), n);
		n=0;
		for (int i = 0; i < str1.length(); i++) {
			n+=Integer.parseInt(String.valueOf(str1.charAt(i)));
			s+=Integer.parseInt(String.valueOf(str2.charAt(i)));			
		}
		bw.write(n==s?"LUCKY":"READY");
		
		bw.flush();
		bw.close();
		br.close();		
	}
}