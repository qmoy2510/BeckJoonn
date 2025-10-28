import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			bw.write(Character.toUpperCase(str.charAt(i)));
		}
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
}