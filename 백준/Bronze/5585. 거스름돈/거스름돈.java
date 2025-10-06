
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = 1000-Integer.parseInt(br.readLine());
		int result =0;
		int[] arr = {500,100,50,10,5,1};
		for (int i = 0; i < arr.length; i++) {
			result+=n/arr[i];
			n=n%arr[i];
		}
		bw.write(String.valueOf(result));
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}