import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		String str = "UOS";
		bw.write(String.valueOf(str.charAt(num%3==0?2:num%3-1)));

		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}