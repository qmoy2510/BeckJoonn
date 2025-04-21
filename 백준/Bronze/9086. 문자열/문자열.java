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
		for (int i = 0; i < num; i++) {
			String str= br.readLine();
			char[] ch = {str.charAt(0), str.charAt(str.length()-1)};
			bw.write(Character.toString((ch[0])) + Character.toString((ch[1]))+ "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}