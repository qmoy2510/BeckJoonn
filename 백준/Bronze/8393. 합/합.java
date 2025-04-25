
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
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			count+=i;
		}
		bw.write(count+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}