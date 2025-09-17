import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int c = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(c/25) + " ");
			c=c%25;
			bw.write(String.valueOf(c/10) + " ");
			c=c%10;
			bw.write(String.valueOf(c/5) + " ");
			c=c%5;
			bw.write(String.valueOf(c/1));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        