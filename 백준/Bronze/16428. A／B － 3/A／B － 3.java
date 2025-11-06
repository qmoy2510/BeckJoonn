import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger bi1 = new BigInteger(st.nextToken());
		BigInteger bi2 = new BigInteger(st.nextToken());
		bw.write(bi1.divide(bi2).toString());
		bw.newLine();
		bw.write(bi1.mod(bi2).toString());
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
}