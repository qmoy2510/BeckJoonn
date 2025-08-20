import java.io.*;
import java.lang.reflect.Array;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		double num01 = Double.parseDouble(st.nextToken());
		double num02 = Double.parseDouble(st.nextToken());
		bw.write(num01-(num02*num01/100)>=100?"0":"1");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
}