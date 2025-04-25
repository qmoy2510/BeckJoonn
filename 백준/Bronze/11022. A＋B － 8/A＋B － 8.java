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
		int a, b;
		
		for (int i = 1; i <= num; i++) {
			String[] str = br.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			bw.write("Case #" + i+": "+ Integer.toString(a) + " + " + Integer.toString(b) + " = " + (a+b)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}