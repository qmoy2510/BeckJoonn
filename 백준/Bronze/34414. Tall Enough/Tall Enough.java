import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		
		int n = Integer.parseInt(br.readLine());
		boolean b = true;
		for (int i = 0; i < n; i++) {
			if(Integer.parseInt(br.readLine())<48) {
				b=false;
			}
		}
		bw.write(b?"True":"False");
		
		bw.flush();
		bw.close();
		br.close();
	}
}