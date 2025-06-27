import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = br.readLine();
		if(str.equals("NLCS")) {
			bw.write("North London Collegiate School");
		}
		else if(str.equals("BHA")) {
			bw.write("Branksome Hall Asia");
		}
		else if(str.equals("KIS")) {
			bw.write("Korea International School");
		}
		else if(str.equals("SJA")) {
			bw.write("St. Johnsbury Academy");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}