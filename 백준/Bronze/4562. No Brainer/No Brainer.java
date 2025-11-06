import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken())>=Integer.parseInt(st.nextToken())?"MMM BRAINS":"NO BRAINS");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}