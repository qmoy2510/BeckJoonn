import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Integer[][] arr;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num01 = Integer.parseInt(st.nextToken());
		int num02 = Integer.parseInt(st.nextToken());
		num01+= Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(Math.max(num01, num02)));
		
		bw.flush();
		bw.close();
		br.close();
	}
}