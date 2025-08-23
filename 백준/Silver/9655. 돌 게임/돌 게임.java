import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static final int  MAX = 21000000; 
	static Integer[] arr = new Integer[1001];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int result = fun(Integer.parseInt(br.readLine()))-1;
		bw.write(result%2==0?"CY":"SK");			
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int fun(int n) {
		if(n==0) {
			return 1;
		}
		if(n<1) {
			return MAX;
		}
		if(arr[n]!=null) {
			return arr[n];
		}
		return arr[n]=Math.min(fun(n-1)+1, fun(n-3)+1);
	}
}