import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw.write((new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken())).toString())	);
		
		bw.flush();
		bw.close();
		br.close();
	}
}