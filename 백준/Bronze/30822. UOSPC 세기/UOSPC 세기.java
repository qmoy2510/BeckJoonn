import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		int[] arr = new int[5];
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if(c=='u') {
				arr[0]++;
			}
			else if(c=='o') {
				arr[1]++;
			}
			else if(c=='s') {
				arr[2]++;
			}
			else if(c=='p') {
				arr[3]++;
			}
			else if(c=='c') {
				arr[4]++;
			}
		}
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[0]));
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}