import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		char[] str01 = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str01[i] = Character.toLowerCase(str.charAt(i));
			}
			else {
				str01[i] = Character.toUpperCase(str.charAt(i));
			}
		}
		for (char c : str01) {
			bw.write(c);
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}