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
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int x=0,o=0;
			for (int j = 0; j < m; j++) {
				if(str.charAt(j)=='O') {
					o++;
				}
				else {
					x++;
				}
			}
			if(o>x) {
				result++;
			}
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}