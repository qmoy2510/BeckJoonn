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
		String str = br.readLine();
		int count = 0;
		for (int i = 0; i < num01; i++) {
			count += Integer.parseInt(String.valueOf(str.charAt(i))); 
		}
		bw.write(count+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}