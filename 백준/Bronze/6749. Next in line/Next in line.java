import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine()),m=Integer.parseInt(br.readLine());
		bw.write(String.valueOf(m+(m-n)));
		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}