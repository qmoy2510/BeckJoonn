//이게 왜 됨??????

import java.io.*;
import java.math.*;	
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Integer result = null;
		StringTokenizer st01 = new StringTokenizer(br.readLine(),"-");
		while(st01.hasMoreTokens()) {	
			StringTokenizer st02 = new StringTokenizer(st01.nextToken(), "+");
			int f = 0;
			while(st02.hasMoreTokens()) {
				f+=Integer.parseInt(st02.nextToken());
			}
			if(result==null) {
				result=f;
				continue;
			}
			result-=f;
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        