import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0, min=0;
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			int l = str.length();
			for (int i = 0; i < l; i++) {
				char c = str.charAt(i);
				if(c=='6'||c=='5') {
					max+=6*Math.pow(10, l-i-1);
					min+=5*Math.pow(10, l-i-1);
					continue;
				}
				max+=(c-'0')*Math.pow(10, l-i-1);
				min+=(c-'0')*Math.pow(10, l-i-1);
			}
		}
		bw.write(String.valueOf(min +" "+max));
		
		bw.flush();
		bw.close();
		br.close();
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        