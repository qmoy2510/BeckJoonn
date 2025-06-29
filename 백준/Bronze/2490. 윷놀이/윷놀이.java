import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = 0;
			while(st.hasMoreTokens()) {
				num +=  Integer.parseInt(st.nextToken())==0?1:0;
			}
			if(num == 0) {
				bw.write("E");
			}
			else if(num == 1) {
				bw.write("A");
			}
			else if(num == 2) {
				bw.write("B");
			}
			else if(num == 3) {
				bw.write("C");
			}
			else if(num == 4) {
				bw.write("D");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}