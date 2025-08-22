import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static final int MAX = 200000000;
	static Integer[] arr = new Integer[1000001];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		bw.write(String.valueOf(fun(Integer.parseInt(br.readLine()))));
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int fun(int n) {
//		System.out.println(n);
		if(n==1) {
			return 0;
		}
		if(n<1) {
			return MAX;
		}
		if(arr[n]!=null) {
			return arr[n];
		}
		
		int num01 = MAX;
		int num02 = MAX;
		if(n%3==0) {
			num01 = fun(n/3)+1;
		}
		if(n%2==0) {
			num02 = fun(n/2)+1;
		}
		
		return arr[n]=Math.min(Math.min(num01,num02), fun(n-1)+1);
	}
}