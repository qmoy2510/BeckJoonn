import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		int n = Integer.parseInt(br.readLine());	
		bw.write(String.valueOf(n-(n/100*22)+" "));
		bw.write(String.valueOf((n/100*80)+(n/100*20-(n/100*20)/100*22)));
		
		bw.flush();
		bw.close();
		br.close();
	}
}