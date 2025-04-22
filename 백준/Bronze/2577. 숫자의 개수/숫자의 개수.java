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
		int num02 = Integer.parseInt(br.readLine());
		int num03 = Integer.parseInt(br.readLine());
		
		String num = Integer.toString(num01*num02*num03);
		
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < num.length(); j++) {
				if(i == Integer.parseInt(String.valueOf(num.charAt(j)))) {
					count++;
				}
				
			}
			bw.write(count + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}