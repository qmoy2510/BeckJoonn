import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		String str = br.readLine();
		bw.write(str.charAt(0)==str.charAt(1)?"1":"0");
		
		bw.flush();
		bw.close();
		br.close();
	}
}