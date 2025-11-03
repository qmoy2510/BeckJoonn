import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());	
		int result = 0;
		while(n>0) {
			result++;
			String str = String.valueOf(result);
			boolean b = true;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)-'0'==m) {
					b = false;
					break;
				}
			}
			if(b) {
				n--;
			}
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}