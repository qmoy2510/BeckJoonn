import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
	
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		long result = 1;
		for (int i = 0; i < n; i++) {
			result *= (n-i);
		}
		bw.write(result+"\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}