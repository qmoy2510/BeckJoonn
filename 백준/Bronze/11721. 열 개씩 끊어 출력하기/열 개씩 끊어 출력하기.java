import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(br.readLine());
		for (int i = 1; i <= sb.length(); i++) {
			bw.write(sb.charAt(i-1));
			if(i%10==0) {
				bw.write("\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}