import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		bw.write(String.valueOf(Integer.parseInt(br.readLine())-2024));
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}