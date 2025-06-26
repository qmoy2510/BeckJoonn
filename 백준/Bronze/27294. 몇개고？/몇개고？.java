import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num01 = Integer.parseInt(st.nextToken()), num02=Integer.parseInt(st.nextToken());
		if(12<=num01 && num01<=16 && num02 == 0) {
			bw.write("320");
		}
		else {			
			bw.write("280");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}