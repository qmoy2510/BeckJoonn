import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long num = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(fibo(0, 1, num)));
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();		
	}
	public static long fibo(long num01, long num02, long count) {
		if(count<=0) {
			return num01;
		}
		else {
			count--;
			long s = num02;
			num02 = s + num01;
			num01 = s;
//			System.out.println(num01);
//			System.out.println(num02);
//			System.out.println();
			return fibo(num01, num02, count);
		}
	}
	
}