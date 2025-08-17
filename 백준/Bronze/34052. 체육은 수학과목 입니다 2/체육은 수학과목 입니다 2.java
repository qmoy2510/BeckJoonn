import java.io.*;
import java.lang.reflect.Array;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count+=Integer.parseInt(br.readLine());
		}
		bw.write(count+300<=1800?"Yes":"No");
		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}