import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int l = str.length();
			for (int j = 0; j < l; j++) {
				bw.write(str.charAt(l-j-1));
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}