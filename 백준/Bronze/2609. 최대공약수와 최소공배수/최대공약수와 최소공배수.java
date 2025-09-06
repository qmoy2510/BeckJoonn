import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s =Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int num = func(s,m);
		bw.write(String.valueOf(num));
		bw.newLine();
		bw.write(String.valueOf((s*m)/num));
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static int func(int num01, int num02) {
		if(num01>num02) {
			if(num01%num02==0) {
				return num02;
			}
			return func(num01%num02, num02);
		}
		if(num02>num01) {
			if(num02%num01==0) {
				return num01;
			}
			return func(num02%num01, num01);
		}
		return num01;
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        