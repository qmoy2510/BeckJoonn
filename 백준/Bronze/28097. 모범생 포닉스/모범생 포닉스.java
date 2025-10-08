import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine())-1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = n*8;
		while (st.hasMoreElements()) {
			result+=Integer.parseInt(st.nextToken());
		}
		bw.write(String.valueOf(result/24+" "+result%24));
		
		bw.flush();
		bw.close();
		br.close();
	}

}