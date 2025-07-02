import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = null;
		int num1, num2;
		while(true) {
			st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			if(num1==0 && num2==0) {
				break;
			}
			bw.write(String.valueOf(num1+num2));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}