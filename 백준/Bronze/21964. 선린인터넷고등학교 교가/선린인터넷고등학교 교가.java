import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		bw.write(str.substring(n-5, n));
		
		bw.flush();
		bw.close();
		br.close();
	}
}