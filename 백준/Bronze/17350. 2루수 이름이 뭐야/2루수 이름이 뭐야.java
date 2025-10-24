import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		boolean b = false;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("anj")) {
				b=true;
			}
		}
	
		bw.write(b?"뭐야;":"뭐야?");
		
		bw.flush();
		bw.close();
		br.close();
	}
}