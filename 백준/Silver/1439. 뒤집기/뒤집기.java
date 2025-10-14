import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String str = br.readLine();
		int zero = 0, one = 0;
		if(str.charAt(0)=='0') {
			zero++;
		}
		else {
			one++;
		}
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				if(str.charAt(i+1)=='0') {
					zero++;
				}
				else {
					one++;
				}
			}
		}
		bw.write(String.valueOf(Math.min(zero, one)));
		
		bw.flush();
		bw.close();
		br.close();
	}
}