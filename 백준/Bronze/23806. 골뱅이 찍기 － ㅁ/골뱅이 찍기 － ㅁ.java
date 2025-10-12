import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n*5; j++) {
				bw.write("@");
			}
			bw.newLine();
		}
		for (int i = 0; i < n*3; i++) {
			for (int j = 0; j < n; j++) {
				bw.write("@");
			}
			for (int j = 0; j < n*3; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < n; j++) {
				bw.write("@");
			}
			bw.newLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n*5; j++) {
				bw.write("@");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}