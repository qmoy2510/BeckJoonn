
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < (num-i)*2-1; j++) {
				bw.write("*");				
			}
			bw.write("\n");
		}		
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num-i-1; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < (i)*2+1; j++) {
				bw.write("*");				
			}
			bw.write("\n");
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}