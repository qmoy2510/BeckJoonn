import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		int[] arr01 = new int[n];
		int[] arr02 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr01[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr02[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr01);
		Arrays.sort(arr02);

		for (int i = 0; i < n; i++) {
			result+=arr01[i]*arr02[n-i-1];
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}