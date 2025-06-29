import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		String str = "EABCD";
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = 0;
			while(st.hasMoreTokens()) {
				num +=  Integer.parseInt(st.nextToken())==0?1:0;
			}
			bw.write(str.charAt(num));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}