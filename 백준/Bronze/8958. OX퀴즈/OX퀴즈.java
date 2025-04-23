import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			int j = 0, b=0, count=0;
			String str = br.readLine();
			for (int k = 0; k <str.length(); k++) {
				if(str.charAt(k) == 'O') {
					b++;
					count+=b;
					j--;
				}
				else {
					b=0;
				}
				j++;
			}
			bw.write(count+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
