import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Integer[][] memo = new Integer[100][2]; 
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Integer[] arr = fibonacci(Integer.parseInt(br.readLine()));
			bw.write(String.valueOf(arr[0])+" "+String.valueOf(arr[1]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static public Integer[] fibonacci(int n) {
	    if (n == 0) {
	    	Integer[] arr = new Integer[2];
	    	arr[0]=1;
	    	arr[1]=0;
	        return arr;
	    } else if (n == 1) {
	    	Integer[] arr = new Integer[2];
	    	arr[1]=1;
	    	arr[0]=0;
	        return arr;
	    } 
	    if(memo[n][0]!=null) {
	    	return memo[n];
	    }
	    else {
	    	Integer[] arr01 = fibonacci(n-1);
	    	Integer[] arr02 = fibonacci(n-2);
	    	memo[n][0]=arr01[0]+arr02[0];
	    	memo[n][1]=arr01[1]+arr02[1];
	        return memo[n];
	    }
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        