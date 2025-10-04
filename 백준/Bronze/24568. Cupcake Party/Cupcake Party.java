
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf((n*8+m*3)-28));
		
		bw.flush();
		bw.close();
		br.close();
	}

}