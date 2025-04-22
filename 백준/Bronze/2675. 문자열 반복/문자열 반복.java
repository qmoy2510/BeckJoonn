import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num01 = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < num01; i++) {
			String[] a = br.readLine().split(" ");
			int num = Integer.parseInt(a[0]);					
			for (int j = 0; j < a[1].length(); j++) {
				for (int j2 = 0; j2 < num; j2++) {
					bw.write(a[1].charAt(j));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
