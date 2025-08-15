import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num-1; i++) {
			for (int j = 0; j < num-i-1; j++) {
				bw.write(" ");
			}
			if(i==0) {
				bw.write("*");
			}
			else {
				bw.write("*");
				for (int j = 0; j < i*2-1; j++) {
					bw.write(" ");
				}
				bw.write("*");
			}
			bw.newLine();
		}
		for (int i = 0; i < num*2-1; i++) {
			bw.write("*");
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}