import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i < num+1; i++) {
			for (int j = 0; j < num-i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}