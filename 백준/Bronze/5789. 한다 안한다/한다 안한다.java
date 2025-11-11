import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			bw.write(str.charAt(str.length()/2-1)==str.charAt(str.length()/2)?"Do-it":"Do-it-Not");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}