import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

	
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-i-1; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for (int i = 0; i < num-1; i++) {
			for (int j = 0; j < i+1; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < num-i-1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();	
		br.close();
		bw.close();
	}
}