import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(new BigInteger(st.nextToken()).add(new BigInteger(st.nextToken())).toString());
			bw.newLine();
		}
				
		
		bw.flush();
		bw.close();
		br.close();		
	}
}