import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String str = br.readLine();
		boolean b = true;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				b=false;
		}
		bw.write(b?"1":"0");
		
		bw.flush();
		bw.close();
		br.close();		
	}
}