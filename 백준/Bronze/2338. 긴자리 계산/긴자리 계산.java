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

		BigInteger num01 = new BigInteger(br.readLine());
		BigInteger num02 = new BigInteger(br.readLine());
		
		bw.write(num01.add(num02) +"\n");
		bw.write(num01.subtract(num02) +"\n");
		bw.write(num01.multiply(num02) +"\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}