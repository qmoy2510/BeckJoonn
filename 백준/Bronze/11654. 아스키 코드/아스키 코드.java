import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char ch = br.readLine().charAt(0);
		int num = (int)ch;
		String str = Integer.toString(num);
		bw.write(str);
		
		bw.flush();
		br.close();
		bw.close();
	}
}