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
		String[] arr = br.readLine().split(" ");
		int num = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
		for (int i = 0; i < arr.length; i++) {
			bw.write(String.valueOf(Integer.parseInt(arr[i]) - num) + " ");	
		}
		bw.write("\n");			
		
		bw.flush();	
		br.close();
		bw.close();
	}
}