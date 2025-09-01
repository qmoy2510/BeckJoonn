import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw.write(String.valueOf(rev(String.valueOf(rev(st.nextToken())+rev(st.nextToken())))));
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int rev(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return Integer.parseInt(sb.toString());
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        