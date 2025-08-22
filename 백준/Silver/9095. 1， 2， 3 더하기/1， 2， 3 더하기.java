import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Integer[] arr = new Integer[30];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			bw.write(String.valueOf(fun(Integer.parseInt(br.readLine()))));			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int fun(int n) {
		if(n==0) {
			return 1;
		}
		if(n<1) {
			return 0;
		}
		
		return arr[n]=(fun(n-1)+fun(n-2)+fun(n-3));
	}
}