import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
	
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 0;
		for (int i = 0; i < 5; i++) {
			count += Integer.parseInt(br.readLine());
		}
		bw.write(count +"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}