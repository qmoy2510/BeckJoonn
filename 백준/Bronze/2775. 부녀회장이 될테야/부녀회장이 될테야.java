import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Integer[][] arr;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine()),m = Integer.parseInt(br.readLine());
			arr = new Integer[n+1][m+1];
			bw.write(String.valueOf(fun(n, m)));
			bw.newLine();
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int fun(int n, int m) {
		if(n==0) {
			return m;
		}
		if(arr[n][m]!=null) {
			return arr[n][m];
		}
		int result=0;
		for (int i = 0; i < m; i++) {
			result+=fun(n-1,m-i);
		}
		return arr[n][m]=result;
	}
}