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
		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Integer.parseInt(Character.toString(str.charAt(i))) == 7) {
				if(Integer.parseInt(str) % 7 ==0) {
					a=3;
				}
				else {
					a=2;
				}
				break;
			}
			else {
				if(Integer.parseInt(str) % 7 == 0) {
					a=1;
				}
				else {
					a=0;
				}
			}
		}

		bw.write(a + "\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}