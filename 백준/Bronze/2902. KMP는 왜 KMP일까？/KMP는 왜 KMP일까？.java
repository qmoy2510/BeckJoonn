import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		StringBuilder rs = new StringBuilder();
		while(st.hasMoreTokens()) {
			 rs.append(st.nextToken().charAt(0));
		}
		bw.write(rs.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
}