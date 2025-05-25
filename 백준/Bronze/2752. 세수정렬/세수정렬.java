import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
	
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int[] num = new int[3];
		for (int i=0; i<3; i++) {			
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		for (int i : num) {
			bw.write(i + " ");						
		}
		bw.write("\n");			
		
		bw.flush();	
		br.close();
		bw.close();
	}
}