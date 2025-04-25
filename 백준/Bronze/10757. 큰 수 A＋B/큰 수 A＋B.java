import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		String[] str = br.readLine().split(" ");
		BigInteger n = new BigInteger(str[0]);
		BigInteger m = new BigInteger(str[1]);
		
		bw.write(n.add(m) + "\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}

