import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static final long  MAX = 2000000000; 
	static HashMap<Long, Long> hm= new HashMap<Long, Long>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long result = fun(Long.parseLong(br.readLine()));
		bw.write(result%2==0?"SK":"CY");			
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static long fun(long n) {
		if(n==0) {
			return 0;
		}
		if(n<1) {
			return MAX;
		}
		if(hm.containsKey(n)) {
			return hm.get(n);
		}
		hm.put(n, Math.min(fun(n-1)+1, fun(n-3)+1));
		return hm.get(n);
	}
}