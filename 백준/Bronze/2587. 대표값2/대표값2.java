import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int[] arr = new int[5];
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			result += arr[i];
		}
		Arrays.sort(arr);
		bw.write(String.valueOf(result/5));
		bw.newLine();
		bw.write(String.valueOf(arr[2]));
		bw.newLine();
		
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}