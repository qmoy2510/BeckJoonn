import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		if(m<3) {
			bw.write("NEWBIE!");
		}
		else if(2<m && m<=n) {
			bw.write("OLDBIE!");
		}
		else {			
			bw.write("TLE!");
		}
		
		
		bw.flush();
		bw.close();
		br.close();		
	}
}