import java.io.*;
import java.lang.reflect.Array;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = br.readLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c=='a') {
				count++;
			}
			else if(c=='e') {
				count++;
			}
			else if(c=='i') {
				count++;
			}
			else if(c=='o') {
				count++;
			}
			else if(c=='u') {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}