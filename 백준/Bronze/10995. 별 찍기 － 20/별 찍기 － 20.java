import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			if(i%2!=0) {
				bw.write(" ");
			}
			for (int j = 0; j < num; j++) {
				bw.write("* ");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}