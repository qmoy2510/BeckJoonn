import java.io.*;
import java.math.*;import java.net.Inet4Address;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter	(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw.write(
				String.valueOf(
						Long.parseLong(
								st.nextToken()+st.nextToken()
								) 
						+ Long.parseLong(
								st.nextToken()+st.nextToken()
								)
						)
				);
		
		bw.flush();
		bw.close();
		br.close();		
	}
	
}