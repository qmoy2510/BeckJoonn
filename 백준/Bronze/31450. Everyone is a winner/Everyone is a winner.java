import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw.write(Integer.parseInt(st.nextToken())%Integer.parseInt(st.nextToken())==0?"Yes":"No");
		
		bw.flush();
		bw.close();
		br.close();
	}
}