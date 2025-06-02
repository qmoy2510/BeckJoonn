import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;
	
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		BigInteger bi1 = new BigInteger(arr[0]);
		BigInteger bi2 = new BigInteger(arr[1]);
		
		bw.write(bi1.add(bi2)+"\n");
	
		bw.flush();	
		br.close();
		bw.close();
	}
}