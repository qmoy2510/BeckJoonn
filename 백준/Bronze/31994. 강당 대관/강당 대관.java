import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		for (int i = 0; i < 7; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String string = st.nextToken();
			tm.put(Integer.parseInt(st.nextToken()), string);
		}

		bw.write(String.valueOf(tm.get(tm.lastKey())));
		
		bw.flush();
		bw.close();
		br.close();
	}
}