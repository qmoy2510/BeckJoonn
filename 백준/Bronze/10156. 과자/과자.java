import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(n<0?"0":n));
		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}