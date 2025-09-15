import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int result = 0;
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int k = Integer.parseInt(st.nextToken());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int i = arr.length-1;
		while(k!=0) {
			if(k-arr[i]>=0) {
				result++;
				k-=arr[i];
				continue;
			}
			i--;
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        