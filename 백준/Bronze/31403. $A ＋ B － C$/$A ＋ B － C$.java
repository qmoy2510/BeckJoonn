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
		
		bw.write(num01 + num02 - num03 +"\n");
		bw.write((Integer.parseInt(Integer.toString(num01)+Integer.toString(num02))-num03) + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
