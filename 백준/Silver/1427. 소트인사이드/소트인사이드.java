import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = br.readLine();
		int l = str.length();
		int[] arr = new int [l];
		for (int i = 0; i < l; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		Arrays.sort(arr);
		for (int i = 0; i < l; i++) {
			bw.write(String.valueOf(arr[l-i-1]));
		}
		bw.flush();
		bw.close();
		br.close();
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        