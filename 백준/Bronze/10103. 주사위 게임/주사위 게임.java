
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int result01=100;
		int result02=100;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(a>b) {
				result02-=a;
			}
			else if(a<b) {
				result01-=b;
			}
		}
		bw.write(String.valueOf(result01));
		bw.newLine();
		bw.write(String.valueOf(result02));
		bw.newLine();
 		
		
		bw.flush();
		bw.close();
		br.close();
	}

}