import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Integer[] arr = new Integer[100001];
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int result = fun(Integer.parseInt(br.readLine()));
		bw.write(String.valueOf(result>100000?-1:result));
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int fun(int n) {
//		System.out.println(n);
		if(n==0) {
			return 0;
		}
		if(n<1) {
			return 1000000;
		}
		if(arr[n]!=null) {
			return arr[n];
		}

		return arr[n]=Math.min(fun(n-2)+1,fun(n-5)+1);
	}
}